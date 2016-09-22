package com.lifuz.observer;

import com.lifuz.observer.weather.WeatherSubJect;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生
 * 改变的时候被通知的对象
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:11
 */
public interface Observer {

    /**
     * 更新接口
     * @param subJect
     */
    void update(SubJect subJect);

    void update(WeatherSubJect subJect);
}
