package com.bliu.sd.service;

import com.bliu.sd.entity.Menu;
import com.bliu.sd.entity.Role;
import com.bliu.sd.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    
    boolean addUser(User user);

    Optional<User> getByUserName(String username);

    Optional<List<Role>> getRolesByUserName(String username);

    Optional<List<Menu>> getMenuByUserName(String username);

    List<User> getAllUser();
}
