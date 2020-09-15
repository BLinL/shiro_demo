package com.neo.sevice;

import com.neo.model.UserInfo;
import java.util.List;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);

    Iterable<UserInfo> findAll();

    boolean save(UserInfo userInfo);

    void delByUid(int uid);
}