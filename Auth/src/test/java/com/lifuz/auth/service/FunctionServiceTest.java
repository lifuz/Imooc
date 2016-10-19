package com.lifuz.auth.service;

import com.lifuz.auth.entity.Function;
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
 * 时间：2016/10/19 9:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class FunctionServiceTest {

    @Autowired
    private FunctionService functionService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void addFunction() throws Exception {
        Function function = new Function();

        function.setName("公告");
        function.setParentId(1000L);
        function.setUrl("www.baidu.com");
        function.setSerialNum(0);
        function.setAccordion(1);

        functionService.addFunction(function);
    }

    @Test
    public void updateUrl() throws Exception {

        Long id = 1002L;
        String url = "www.imooc.com";

        functionService.updateUrl(id,url);

    }

    @Test
    public void getFunctions() throws Exception {
        List<Function> functions = functionService.getFunctions(1,5,1000L);
        logger.debug("functions = {}", functions);
    }

    @Test
    public void deleteFunctionById() throws Exception {

        Long id = 1002L;

        functionService.deleteFunctionById(id);

    }

    @Test
    public void getAllFunction() throws Exception {

        List<Function> functions = functionService.getAllFunction();

        logger.debug("functions = {}", functions);

    }

}