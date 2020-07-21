package com.bliu.sd.service.impl;

import com.bliu.sd.dao.UserMapper;
import com.bliu.sd.entity.User;
import com.bliu.sd.entity.UserExample;
import com.bliu.sd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean addUser(User user) {
        int ret = userMapper.insert(user);
        return ret > 0;
    }

    @Override
    public User getById(int id) {
        return null;
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

}
