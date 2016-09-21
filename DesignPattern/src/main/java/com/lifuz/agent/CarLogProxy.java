package com.lifuz.agent;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 15:41
 */
public class CarLogProxy implements Moveable {

    private Moveable m;

    public CarLogProxy(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() {

        System.out.println("日志开始");
        m.move();

        System.out.println("日志结束");

    }
}
