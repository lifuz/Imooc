package com.lifuz.template;

/**
 *
 * 提供咖啡制备的具体实现
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 11:27
 */
public class Coffee extends RefreshBeverage {


    @Override
    protected void addCondiments() {

        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {

        System.out.println("用沸水冲泡咖啡");

    }



}
