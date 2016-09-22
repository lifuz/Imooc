package com.lifuz.observer;

import com.lifuz.observer.weather.ConcreteWeatherSubject;
import com.lifuz.observer.weather.WeatherSubJect;
import lombok.Data;

/**
 * 这个一个具体的观察者对象，实现更新的方法
 * 使自身的状态和
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:13
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    private String observerName ;

    private String weatherContent;

    private String remindThing;

    public void update(SubJect subJect) {

        observerState = ((ConcreteSubject)subJect).getSubjectState();

    }

    public void update(WeatherSubJect subJect) {
        weatherContent = ((ConcreteWeatherSubject)subJect).getWeatherContent();

        System.out.println(observerName + "收到了" + weatherContent + "," +remindThing);

    }

    @Override
    public void update(String content) {

        weatherContent = content;

        System.out.println(observerName + "收到了" + weatherContent + "," +remindThing);

    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }
}
