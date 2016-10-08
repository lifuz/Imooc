package com.lifuz.auth.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/8 17:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserRoleDaoTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRoleDao userRoleDao;

    @Test
    public void saveUserRole() throws Exception {



    }

    @Test
    public void getUserRole() throws Exception {

    }

    @Test
    public void findUserRolesByUserId() throws Exception {

    }

    @Test
    public void findUserRoles() throws Exception {

    }

    @Test
    public void findUserRoleByRoleId() throws Exception {

    }

    @Test
    public void deleteById() throws Exception {

    }

}