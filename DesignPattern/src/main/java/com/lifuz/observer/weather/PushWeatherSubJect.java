package com.lifuz.observer.weather;

import com.lifuz.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象,他知道观察他的观察者，并提供注册（添加） 和删除观察者的接口
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:02
 */
public class PushWeatherSubJect {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加注册者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除注册者
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    protected void notifyObservers(String content) {

        for (Observer observer:observers
             ) {

            observer.update(content);

        }

    }


}
