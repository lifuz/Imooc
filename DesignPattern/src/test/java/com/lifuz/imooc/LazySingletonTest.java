package com.lifuz.imooc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 9:59
 */
public class LazySingletonTest {
    @Test
    public void getInstance() throws Exception {

        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();

        if (ls1 == ls2) {

            System.out.println("两个实例相同");

        } else {
            System.out.println("两个实例不同");
        }

    }

}