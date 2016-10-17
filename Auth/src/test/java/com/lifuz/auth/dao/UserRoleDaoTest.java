package com.lifuz.auth.dao;

import com.lifuz.auth.entity.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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

        UserRole userRole = new UserRole();
        userRole.setUserId(1000L);
        userRole.setRoleId(1000L);

        int result = userRoleDao.saveUserRole(userRole);

        logger.debug("result = {} \nuserRole = {}",result,userRole);

    }

    @Test
    public void getUserRole() throws Exception {

        UserRole userRole = userRoleDao.getUserRole(1000L);

        logger.debug("userRole = {}",userRole);

    }

    @Test
    public void findUserRolesByUserId() throws Exception {

        List<UserRole> userRoles = userRoleDao.findUserRolesByUserId(1000L);

        logger.debug("userRole = {}",userRoles);

    }

    @Test
    public void findUserRoles() throws Exception {

        List<UserRole> userRoles = userRoleDao.findUserRoles(0,5);

        logger.debug("userRole = {}",userRoles);

    }

    @Test
    public void findUserRoleByRoleId() throws Exception {

        List<UserRole> userRoles = userRoleDao.findUserRoleByRoleId(1000L);

        logger.debug("userRole = {}",userRoles);

    }

    @Test
    public void deleteById() throws Exception {

        int result = userRoleDao.deleteById(1000L);

        logger.debug("result = {}",result);

    }

}