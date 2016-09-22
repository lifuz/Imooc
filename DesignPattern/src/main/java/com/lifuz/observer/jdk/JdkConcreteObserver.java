package com.lifuz.observer.jdk;


import java.util.Observable;
import java.util.Observer;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 14:28
 */
public class JdkConcreteObserver implements Observer {

    private String observerName ;

    private String weatherContent;

    private String remindThing;

    @Override
    public void update(Observable o, Object arg) {

        //第一种是推的方式
        System.out.println(observerName + "收到了" + arg + "," +remindThing);

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
