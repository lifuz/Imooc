package com.lifuz.agent.cglib;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 16:09
 */
public class TrainTest {

    @Test
    public void move() throws Exception {

        CglibProxy proxy = new CglibProxy();
        Train t = (Train) proxy.getProxy(Train.class);

        t.move();

    }

}