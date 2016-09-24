package com.lifuz.Strategy;

/**
 *
 * 超累，所有的鸭子都要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/23 10:35
 */
public abstract class Duck {

    /**
     * 鸭子发出叫声
     * 通用行为，由超类实现
     */
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观
     */
    public abstract void display();


}
