package com.bliu.sd.service;

import com.bliu.sd.entity.User;

import java.util.Optional;

public interface UserService {
    
    boolean addUser(User user);

    User getById(int id);

    Optional<User> getByUserName(String username);
}
