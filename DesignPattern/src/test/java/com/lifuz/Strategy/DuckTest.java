package com.lifuz.Strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 10:17
 */
public class DuckTest {


    @Test
    public void quack() throws Exception {

        Duck mallar = new MallardDuck();
        Duck red = new RedHeadDuck();

        mallar.display();
        mallar.quack();
        mallar.fly();

        red.display();
        red.quack();
        red.fly();

    }

    @Test
    public void display() throws Exception {

        Duck rubber = new RubberDuck();

        rubber.display();
        rubber.quack();
        rubber.fly();

    }

    @Test
    public void fly() throws Exception {

    }

}