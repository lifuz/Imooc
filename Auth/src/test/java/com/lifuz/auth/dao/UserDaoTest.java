package com.lifuz.auth.dao;

import com.lifuz.auth.entity.User;
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
 * 时间：2016/10/8 10:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    @Test
    public void findByIds() throws Exception {
        List<Long> list = new ArrayList<>();
        list.add(100L);
        list.add(123L);
        List<User> users = userDao.findByIds(list);
        logger.debug("users = {}",users);
    }

    @Test
    public void findUsers() throws Exception {

        int offset = 0;
        int rows = 10;

        List<User> users = userDao.findUsers(offset,rows);
        logger.debug("users = {}",users);

    }

    @Test
    public void updateUser() throws Exception {

        String name = "lifuz";
        String pwd = "8";

        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        user.setId(1001L);

        int result = userDao.updateUser(user);

        logger.debug("result = {}",result);

    }

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Test
    public void getUser() throws Exception {

        String name = "lifuz";
        String pwd = "8";

        User user = userDao.getUser(name,pwd);

        logger.debug("user = {}",user);

    }

    @Test
    public void saveUser() throws Exception {

        String name = "lifuz";
        String pwd = "8";

        User user = new User();
        user.setName(name);
        user.setPwd(pwd);

        int result = userDao.saveUser(user);

        logger.debug("result = {}", result);

    }

    @Test
    public void deleteById() throws Exception {

        Long id = 1001L;

        int result = userDao.deleteById(id);

        logger.debug("result = {}",result);

    }

}