package com.lifuz.auth.service;

import com.lifuz.auth.entity.Role;
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

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/10/18 14:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class RoleServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleService roleService;

    @Test
    public void addRole() throws Exception {

        Role role = new Role();

        role.setName("测试");

        List<RoleFunction> roleFunctions = new ArrayList<>();

        RoleFunction roleFunction = new RoleFunction();
        roleFunction.setFuntionId(1000L);
        roleFunction.setStatus(1);

        roleFunctions.add(roleFunction);

        roleFunction = new RoleFunction();
        roleFunction.setFuntionId(10001L);
        roleFunction.setStatus(1);
        roleFunctions.add(roleFunction);

        roleService.addRole(role, roleFunctions);

    }

    @Test
    public void editRole() throws Exception {

        Role role = new Role();

        role.setName("测试");
        role.setId(1001L);

        List<RoleFunction> roleFunctions = new ArrayList<>();

        RoleFunction roleFunction = new RoleFunction();
        roleFunction.setFuntionId(1000L);
        roleFunction.setStatus(1);

        roleFunctions.add(roleFunction);

        roleFunction = new RoleFunction();
        roleFunction.setFuntionId(1001L);
        roleFunction.setStatus(1);
        roleFunctions.add(roleFunction);

        roleService.editRole(role, roleFunctions);

    }

    @Test
    public void deleteRole() throws Exception {

        roleService.deleteRole(1001L);

    }

    @Test
    public void getRoles() throws Exception {

        List<Role> roles = roleService.getRoles(1,5);

        logger.debug("roles = {}", roles);

    }

    @Test
    public void getRoles1() throws Exception {

        List<Long> ids = new ArrayList<>();

        ids.add(1000L);
        ids.add(1001L);

        List<Role> roles = roleService.getRoles(ids);

        logger.debug("roles = {}", roles);

    }

    @Test
    public void getRoleFunctions() throws Exception {

        List<RoleFunction> roleFunctions = roleService.getRoleFunctions(1001L);

        logger.debug("roleFunctions = {}", roleFunctions);

    }

}