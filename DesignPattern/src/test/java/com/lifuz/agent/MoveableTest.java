package com.lifuz.agent;

import org.junit.Test;

/**
 *
 * 测试静态代理
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 13:33
 */
public class MoveableTest {

    @Test
    public void move() throws Exception {
        Car car = new Car();
        car.move();

        Moveable moveable = new Car();
        moveable.move();


    }

    @Test
    public void proxy(){

        Car car = new Car();

        CarTimeProxy carTimeProxy = new CarTimeProxy(car);
        CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
        carLogProxy.move();

    }


}