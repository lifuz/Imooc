package com.lifuz.agent;

import java.util.Random;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 13:28
 */
public class Car implements Moveable {
    @Override
    public void move() {



        try {
            Thread.sleep(new Random().nextInt(1000));

            System.out.println("汽车开始行使中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
