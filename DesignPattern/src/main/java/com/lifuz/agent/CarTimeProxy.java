package com.lifuz.agent;

/**
 * 代理类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 15:39
 */
public class CarTimeProxy implements Moveable {

   private Moveable m;

    public CarTimeProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {

        Long beginTime = System.currentTimeMillis();
        System.out.println("汽车开始行使");

        m.move();

        Long endTime = System.currentTimeMillis();

        System.out.println("汽车停止行使，行使的时间为：" + (endTime - beginTime) +" ms");

    }
}
