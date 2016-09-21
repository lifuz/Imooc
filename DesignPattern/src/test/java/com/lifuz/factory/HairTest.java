package com.lifuz.factory;

import org.junit.Test;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 10:20
 */
public class HairTest {

    @Test
    public void testLeft() {

        Hair left = new LeftHair();
        left.draw();

    }

    @Test
    public void  testRight() {
        Hair right = new RightHair();
        right.draw();
    }

}