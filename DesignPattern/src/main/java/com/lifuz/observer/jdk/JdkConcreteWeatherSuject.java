package com.lifuz.observer.jdk;

import java.util.Observable;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 14:21
 */
public class JdkConcreteWeatherSuject extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        this.notifyObservers(content);
    }
}
