package com.lifuz.auth.dao;

import com.lifuz.auth.entity.Role;
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
 * 时间：2016/10/8 10:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RoleDaoTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleDao roleDao;

    @Test
    public void saveRole() throws Exception {

        String name = "imooc";

        Role role = new Role();
        role.setName(name);

        int result = roleDao.saveRole(role);

        logger.debug("result = {} \n role = {}",result,role);

    }

    @Test
    public void getRole() throws Exception {

        Long id = 1000L;

        Role role = roleDao.getRole(id);

        logger.debug("role = {}",role);

    }

    @Test
    public void updateRole() throws Exception {

        Long id = 1000L;
        String name = "lifuz";

        Role role = new Role();
        role.setName(name);
        role.setId(id);

        int result = roleDao.updateRole(role);

        logger.debug("result = {} \n role = {}",result,role);

    }

    @Test
    public void deleteById() throws Exception {

        Long id = 1000L;

        int result = roleDao.deleteById(id);

        logger.debug("result = {}",result);

    }

}