package com.lifuz.singleton;

/**
 *
 * 单例模式 懒汉模式
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 9:55
 */
public class LazySingleton {

    //1.将构造方法私有化，不允许外部直接创建对象
    private LazySingleton() {
    }

    //2.声明类的唯一实例，使用private static 修饰
    private static LazySingleton ourInstance;

    //3.提供一个用于获取实例的方法，使用 public static
    public static LazySingleton getInstance() {

        if (ourInstance == null) {
            ourInstance = new LazySingleton();
        }

        return ourInstance;
    }


}
