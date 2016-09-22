package com.lifuz.observer.weather;

/**
 *
 * 具体的目标对象，负责把有关状态存入到想应的观察者对象中
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 11:09
 */
public class ConcreteWeatherSubject extends WeatherSubJect {

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }
}
