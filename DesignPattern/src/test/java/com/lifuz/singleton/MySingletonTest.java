package com.lifuz.singleton;

import org.junit.Test;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 9:44
 */
public class MySingletonTest {


    @Test
    public void getInstance() throws Exception {

        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();

        if (s1 == s2) {

            System.out.println("两个实例相同");

        } else {
            System.out.println("两个实例不同");
        }

    }


}