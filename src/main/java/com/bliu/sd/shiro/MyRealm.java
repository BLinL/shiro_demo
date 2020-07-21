package com.bliu.sd.shiro;


import com.bliu.sd.dao.UserMapper;
import com.bliu.sd.entity.User;
import com.bliu.sd.entity.UserExample;
import com.bliu.sd.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MyRealm extends JdbcRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        String userName = userToken.getUsername();

        Optional<User> optionalUser = userService.getByUserName(userName);
        if(!optionalUser.isPresent()){
            throw new IncorrectCredentialsException("User didn't existed!");
        }
        User user = optionalUser.get();
        if(user.getStatus() == 1){
            throw new LockedAccountException("Account is blocked!");
        }

        SimpleAuthenticationInfo simpleAuthInfo = new SimpleAuthenticationInfo(user, user.getPassword() ,getName());

        return simpleAuthInfo;
    }
}
