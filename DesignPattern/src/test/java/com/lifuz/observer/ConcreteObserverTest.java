package com.lifuz.observer;

import com.lifuz.observer.jdk.JdkConcreteObserver;
import com.lifuz.observer.jdk.JdkConcreteWeatherSuject;
import com.lifuz.observer.weather.ConcreteWeatherSubject;
import com.lifuz.observer.weather.PushConcreteWeatherSubject;
import com.lifuz.observer.weather.PushWeatherSubJect;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:53
 */
public class ConcreteObserverTest {

    @Test
    public void update() throws Exception {

        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        ConcreteObserver observer = new ConcreteObserver();

        observer.setObserverName("老妈");
        observer.setRemindThing("是一个购物的好日子，明天去扫货");

        ConcreteObserver observerGirl = new ConcreteObserver();

        observerGirl.setObserverName("黄明女朋友");
        observerGirl.setRemindThing("是我们第一次约会，地点街心公园，不见不散哦");

        weatherSubject.attach(observer);
        weatherSubject.attach(observerGirl);

//        weatherSubject.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
//
//        PushConcreteWeatherSubject pushWeatherSubJect = new PushConcreteWeatherSubject();
//
//        pushWeatherSubJect.attach(observer);
//        pushWeatherSubJect.attach(observerGirl);
//
//        pushWeatherSubJect.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");

        JdkConcreteWeatherSuject jdkSuject = new JdkConcreteWeatherSuject();
//        jdkSuject.addObserver();
        JdkConcreteObserver jdkObserver = new JdkConcreteObserver();

        jdkObserver.setObserverName("老妈");
        jdkObserver.setRemindThing("是一个购物的好日子，明天去扫货");

        JdkConcreteObserver jdkConcreteObserver = new JdkConcreteObserver();
        jdkConcreteObserver.setObserverName("黄明女朋友");
        jdkConcreteObserver.setRemindThing("是我们第一次约会，地点街心公园，不见不散哦");

        jdkSuject.addObserver(jdkObserver);
        jdkSuject.addObserver(jdkConcreteObserver);

        jdkSuject.setContent("明天天气晴朗，蓝天白云，气温28度");

    }

}