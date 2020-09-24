package com.neo.dao;

import com.neo.model.UserInfo;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);

    UserInfo findByUid(int uid);

    @Transactional
    @Modifying
    void deleteByUid(int uid);

}