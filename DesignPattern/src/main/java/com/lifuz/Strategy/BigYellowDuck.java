package com.lifuz.Strategy;

import com.lifuz.Strategy.impl.FlyNOWay;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 10:27
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck() {

        super();
        super.setFlyingStategy(new FlyNOWay());

    }

    @Override
    public void display() {
        System.out.println("我是大黄鸭");
    }
}
