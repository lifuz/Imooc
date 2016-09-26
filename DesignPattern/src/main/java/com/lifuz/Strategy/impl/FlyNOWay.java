package com.lifuz.Strategy.impl;

import com.lifuz.Strategy.FlyingStategy;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 10:21
 */
public class FlyNOWay implements FlyingStategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞行！");
    }
}
