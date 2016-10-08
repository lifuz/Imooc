package com.lifuz.auth.dao;

import com.lifuz.auth.entity.Function;
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
 * 时间：2016/10/8 11:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FunctionDaoTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FunctionDao functionDao;

    @Test
    public void saveFun() throws Exception {

        Function function = new Function();

        function.setName("公告");
        function.setParentId(1000L);
        function.setUrl("www.baidu.com");
        function.setSerialNum(0);
        function.setAccordion(1);

        int result = functionDao.saveFun(function);

        logger.debug("result = {} \nfunction = {}",result,function);

    }

    @Test
    public void getFun() throws Exception {

        Long id = 1000L;

        Function function = functionDao.getFun(id);

        logger.debug("function = {}",function);

    }

    @Test
    public void updateFun() throws Exception {

        Long id = 1000L;

        Function function = functionDao.getFun(id);

        function.setName("广告");
        function.setUrl(null);

        int result = functionDao.updateFun(function);

        logger.debug("result = {} \nfunction = {}",result,function);

    }

    @Test
    public void deleteFun() throws Exception {

        Long id = 1000L;

        int result = functionDao.deleteFun(id);

        logger.debug("result = {}",result);

    }

}