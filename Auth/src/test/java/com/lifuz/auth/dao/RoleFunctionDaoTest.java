package com.lifuz.auth.dao;

import com.lifuz.auth.entity.RoleFunction;
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
 * 时间：2016/10/18 13:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RoleFunctionDaoTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleFunctionDao roleFunctionDao;

    @Test
    public void saveRoleFunctions() throws Exception {

        List<RoleFunction> roleFunctions = new ArrayList<>();

        RoleFunction roleFunction = new RoleFunction();
        roleFunction.setRoleId(1000L);
        roleFunction.setFuntionId(1000L);
        roleFunction.setStatus(1);

        roleFunctions.add(roleFunction);

        roleFunction = new RoleFunction();
        roleFunction.setRoleId(1000L);
        roleFunction.setFuntionId(10001L);
        roleFunction.setStatus(1);
        roleFunctions.add(roleFunction);

        int result = roleFunctionDao.saveRoleFunctions(roleFunctions);

        logger.debug("result = {}", result);

    }

    @Test
    public void deleteByRoleId() throws Exception {

        Long roleId = 1000L;

        int result = roleFunctionDao.deleteByRoleId(roleId);

        logger.debug("result = {}", result);

    }

    @Test
    public void findByRoleId() throws Exception {

        Long roleId = 1001L;

        List<RoleFunction> roleFunctions = roleFunctionDao.findByRoleId(roleId);

        logger.debug("roleFunctions = {}", roleFunctions);

    }

}