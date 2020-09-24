package com.neo.sevice.impl;

import com.neo.dao.UserInfoDao;
import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;
import com.neo.util.CredentialUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

    @Override
    public Iterable<UserInfo> findAll(){
        return userInfoDao.findAll();
    }

    @Override
    public boolean save(UserInfo userInfo) {
        UserInfo ret = userInfoDao.save(userInfo);
        System.out.println("ret:"+ret);
        return ret != null;
    }

    @Override
    public boolean update(UserInfo userInfo) {
        UserInfo oldValue = userInfoDao.findByUid(userInfo.getUid());
        oldValue.setName(userInfo.getName());
        oldValue.setSalt(CredentialUtil.hash(userInfo.getPassword()));
        oldValue.setPassword(CredentialUtil.hash(userInfo.getPassword(),oldValue.getCredentialsSalt()));

        return save(oldValue);
    }

    @Override
    public void delByUid(int uid) {
        System.out.println("-------del user uid=" + uid);
        userInfoDao.deleteByUid(uid);
    }

}