package com.lifuz.factory.family;

import org.junit.Test;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 11:45
 */
public class PersonFactoryTest {

    @Test
    public void test() {

        PersonFactory factory = new MCPersonFactory();

        Boy boy = factory.getBoy();
        boy.drawMan();
        Girl girl = factory.getGirl();
        girl.drawWoman();

        factory = new HNPersonFactory();
        boy = factory.getBoy();
        boy.drawMan();
        girl = factory.getGirl();
        girl.drawWoman();

    }


}