package com.lifuz.observer;

/**
 * 这个一个具体的观察者对象，实现更新的方法
 * 使自身的状态和
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:13
 */
public class ConcreteObserver implements Observer {

    private String observerState ;

    public void update(SubJect subJect) {

        observerState = ((ConcreteSubject)subJect).getSubjectState();

    }
}
