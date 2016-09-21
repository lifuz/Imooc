package com.lifuz.imooc;

/**
 * 单例模式 Singleton
 * 应用场合 有些类只需要一个实例
 * <p>
 * 作用 保证整个应用程序中某个实例有且只有一个
 * 类型 恶汉模式，懒汉模式
 * <p>
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 9:41
 */
public class MySingleton {

    //1.将构造方法私有化，不允许外部直接创建对象
    private MySingleton() {
    }

    //2.创建类的唯一实例
    private static MySingleton ourInstance = new MySingleton();

    //3.提供一个用于获取实例的方法
    public static MySingleton getInstance() {
        return ourInstance;
    }


}
