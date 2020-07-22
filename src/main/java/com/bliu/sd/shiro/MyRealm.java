package com.bliu.sd.shiro;


import com.bliu.sd.dao.UserMapper;
import com.bliu.sd.entity.Menu;
import com.bliu.sd.entity.Role;
import com.bliu.sd.entity.User;
import com.bliu.sd.entity.UserExample;
import com.bliu.sd.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyRealm extends JdbcRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        String userName = userToken.getUsername();

        Optional<User> optionalUser = userService.getByUserName(userName);
        if (!optionalUser.isPresent()) {
            throw new IncorrectCredentialsException("User didn't existed!");
        }
        User user = optionalUser.get();
        if (user.getStatus() == 1) {
            throw new LockedAccountException("Account is blocked!");
        }

        SimpleAuthenticationInfo simpleAuthInfo = new SimpleAuthenticationInfo(user, user.getPassword(), getName());

        return simpleAuthInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) principals.getPrimaryPrincipal();
        System.out.println(user);

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Optional<List<Role>> optionalRoles = userService.getRolesByUserName(user.getUser_name());

        if (optionalRoles.isPresent()) {
            List<String> strRoles = optionalRoles.get().stream().map(Role::getRole_name).collect(Collectors.toList());
            authorizationInfo.addRoles(strRoles);
        }

        Optional<List<Menu>> optionalMenus = userService.getMenuByUserName(user.getUser_name());
        optionalMenus.ifPresent(menus -> {
            List<String> strPermissions = menus.stream().map(Menu::getPermission).collect(Collectors.toList());
            authorizationInfo.addStringPermissions(strPermissions);
        });
        return authorizationInfo;
    }

    @Override
    protected void doClearCache(PrincipalCollection principals) {
        super.doClearCache(principals);
    }
}
