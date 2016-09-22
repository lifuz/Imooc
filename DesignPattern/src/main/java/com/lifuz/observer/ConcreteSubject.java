package com.lifuz.observer;

import lombok.Data;

/**
 *
 * 具体的目标对象，负责把有关状态存入到想应的观察者对象中
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:09
 */
public class ConcreteSubject extends SubJect {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
