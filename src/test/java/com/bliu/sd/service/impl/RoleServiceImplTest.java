package com.bliu.sd.service.impl;

import com.bliu.sd.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RoleServiceImplTest {

    @Autowired
    RoleService roleService;

    @Test
    public void testRoleService(){
        System.out.println(roleService.getByRoleName("admin"));
        System.out.println(roleService.getAll());
    }
}