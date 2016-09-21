package com.lifuz.agent.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 15:49
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Long beginTime = System.currentTimeMillis();
        System.out.println("汽车开始行使");
        method.invoke(target);

        Long endTime = System.currentTimeMillis();

        System.out.println("汽车停止行使，行使的时间为：" + (endTime - beginTime) +" ms");


        return null;
    }
}
