package com.lifuz.agent;

import com.lifuz.agent.jdk.LogHandler;
import com.lifuz.agent.jdk.TimeHandler;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 15:53
 */
public class CarTest {

    @Test
    public void move() throws Exception {

        Car car = new Car();

        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();

        Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);

        h = new LogHandler(m);

        cls = m.getClass();

        m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);

        m.move();

    }

}