package com.lifuz.Strategy;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/23 11:32
 */
public class RedHeadDuck extends Duck {

    @Override
    public void quack() {
        super.quack();
    }

    @Override
    public void display() {


        System.out.println("我的脖子是红色的");

    }
}
