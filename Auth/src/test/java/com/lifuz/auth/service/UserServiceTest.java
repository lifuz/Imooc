package com.lifuz.auth.service;

import com.lifuz.auth.entity.User;
import com.lifuz.auth.entity.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/17 10:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void addUser() throws Exception {

        String name = "lifuz";
        String pwd = "8";

        User user = new User();
        user.setName(name);
        user.setPwd(pwd);

        userService.addUser(user);

    }

    @Test
    public void updateUser() throws Exception {

        String name = "lifuz";
        String pwd = "88";

        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        user.setId(1002L);

        userService.updateUser(user);

    }

    @Test
    public void deleteUserById() throws Exception {


        userService.deleteUserById(1002L);

    }

    @Test
    public void getUser() throws Exception {

        String name = "lifuz";
        String pwd = "88";

        User user = userService.getUser(name,pwd);

        logger.error("user = {}",user);

    }

    @Test
    public void getUsers() throws Exception {

        List<User> users  = userService.getUsers(1,5);

        logger.debug("users = {}",users);

    }

    @Test
    public void getUsers1() throws Exception {

        List<Long> ids = new ArrayList<>();

        ids.add(1002L);

        List<User> users = userService.getUsers(ids);

        logger.debug("users = {}",users);

    }

    @Test
    public void getUsserRoles() throws Exception {

        List<UserRole> userRoles = userService.getUsserRoles(1,2);

        logger.debug("userRoles = {}",userRoles);

    }

    @Test
    public void getUserRolesByUserId() throws Exception {

        List<UserRole> userRoles = userService.getUserRolesByUserId(1002L);
        logger.debug("userRoles = {}",userRoles);

    }

    @Test
    public void addUserRoles() throws Exception {

        List<Long> roleIds = new ArrayList<>();
        roleIds.add(1000L);
        roleIds.add(1002L);
        roleIds.add(1001L);

        Long userId = 1002L;

        userService.addUserRoles(userId,roleIds);

    }

}