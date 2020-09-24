package com.neo.sevice.impl;

import static org.junit.Assert.*;

import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoServiceImplTest {

  @Autowired
  private UserInfoService userInfoService;

  @Test
  public void testFindUser(){
    Iterable<UserInfo> userList = userInfoService.findAll();
    userList.forEach(System.out::println);
  }

  @Test
  public void updateUser(){
    UserInfo user = userInfoService.findByUsername("admin");
    user.setState((byte) 1);
    userInfoService.save(user);
    System.out.println(user);
  }
}