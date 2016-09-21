package com.lifuz.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 10:29
 */
public class HairFactoryTest {

    @Test
    public void getHairByClassKey() throws Exception {
        HairFactory hairFactory = HairFactory.getInstance();

        Hair hair = hairFactory.getHairByClassKey("left");
        hair.draw();

        hair = hairFactory.getHairByClassKey("right");
        hair.draw();

        hair = hairFactory.getHairByClassKey("middle");
        hair.draw();
    }

    @Test
    public void getHairByClassName() throws Exception {

        HairFactory hairFactory = HairFactory.getInstance();

        Hair hair = hairFactory.getHairByClassName("com.lifuz.factory.LeftHair");
        hair.draw();

        hair = hairFactory.getHairByClassName("com.lifuz.factory.RightHair");
        hair.draw();

    }

    @Test
    public void getHair() throws Exception {

        HairFactory hairFactory = HairFactory.getInstance();

        Hair hair = hairFactory.getHair("left");
        hair.draw();

        hair = hairFactory.getHair("right");
        hair.draw();

    }



}