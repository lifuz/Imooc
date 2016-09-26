package com.lifuz.Strategy;

import com.lifuz.Strategy.impl.FlyWithWin;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/23 11:31
 */
public class MallardDuck extends Duck {

    @Override
    public void quack() {
        super.quack();
        super.setFlyingStategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
}
