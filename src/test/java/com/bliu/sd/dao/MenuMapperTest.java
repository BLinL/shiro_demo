package com.bliu.sd.dao;

import com.bliu.sd.entity.User;
import com.bliu.sd.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuMapperTest {

    @Autowired private UserMapper userMapper;

    @Test public void test(){
        userMapper.selectByExample(new UserExample(){

        });
    }


}