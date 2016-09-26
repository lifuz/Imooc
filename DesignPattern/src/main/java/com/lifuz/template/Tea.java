package com.lifuz.template;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 11:32
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("不用添加");
    }

    @Override
    protected void brew() {

        System.out.println("用热水炮制茶叶");

    }
}
