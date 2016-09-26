package com.lifuz.Strategy;

import com.lifuz.Strategy.impl.FlyNOWay;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 10:22
 */
public class RubberDuck extends Duck {

    public RubberDuck() {

        super();
        super.setFlyingStategy(new FlyNOWay());

    }

    @Override
    public void display() {

        System.out.println("全身发黄，嘴巴很红");

    }

    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎");
    }
}
