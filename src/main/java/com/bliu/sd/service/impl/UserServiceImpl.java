package com.bliu.sd.service.impl;

import com.bliu.sd.dao.*;
import com.bliu.sd.entity.*;
import com.bliu.sd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public boolean addUser(User user) {
        int ret = userMapper.insert(user);
        return ret > 0;
    }

    @Override
    public Optional<User> getByUserName(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUser_nameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        Optional<User> optionalUser = Optional.ofNullable(users.size() == 0 ? null : users.get(0));
        return optionalUser;
    }

    @Override
    public Optional<List<Role>> getRolesByUserName(String username) {
        List<Role> roleList = new ArrayList<>();
        Optional<User> optionalUser = getByUserName(username);
        if (!optionalUser.isPresent()) {
            return Optional.ofNullable(null);
        }
        User user = optionalUser.get();

        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();

        UserRoleExample userRoleExample = new UserRoleExample();
        UserRoleExample.Criteria uRcriteria = userRoleExample.createCriteria();
        uRcriteria.andUser_idEqualTo(user.getId());

        List<UserRole> userRole = userRoleMapper.selectByExample(userRoleExample);
        if (userRole.size() == 0) {
            return Optional.ofNullable(null);
        }

        userRole.forEach(element -> {
            criteria.andIdEqualTo(element.getRole_id());
            List<Role> roles = roleMapper.selectByExample(roleExample);
            roleList.addAll(roles);
        });

        return Optional.of(roleList);
    }

    @Override
    public Optional<List<Menu>> getMenuByUserName(String username) {
        List<Menu> menuList = new ArrayList<>();

        Optional<List<Role>> optionalRoles = getRolesByUserName(username);
        if (!optionalRoles.isPresent()) {
            return Optional.of(menuList);
        }

        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria rMcriteria = roleMenuExample.createCriteria();

        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria mCriteria = menuExample.createCriteria();

        List<Role> roles = optionalRoles.get();
        roles.forEach(role -> {
            Integer roleId = role.getId();
            rMcriteria.andRole_idEqualTo(roleId);
            List<RoleMenu> roleMenus = roleMenuMapper.selectByExample(roleMenuExample);

            mCriteria.andIdIn(roleMenus.stream().map(RoleMenu::getMenu_id).collect(Collectors.toList()));
            List<Menu> menus = menuMapper.selectByExample(menuExample);
            menuList.addAll(menus);
        });

        return Optional.of(menuList);
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userMapper.selectByExample(new UserExample());
        return userList;
    }

}
