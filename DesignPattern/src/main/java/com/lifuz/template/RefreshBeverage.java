package com.lifuz.template;

/**
 *
 * 抽象基类，为所有的子类提供一个算法框架
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 11:15
 */
public abstract class RefreshBeverage {

    /**
     * 制备饮料的模板方法
     */
    public final void prepareBeverageTemplate() {

        //1.将水煮沸
        boilWater();

        //2.炮制饮料
        brew();

        //3.将饮料导入杯中
        pourIncup();

        //4.加入调味料
        addCondiments();
    }

    protected abstract void addCondiments();


    private void pourIncup(){
        System.out.println("将饮料导入杯中");
    }

    protected abstract void brew();

    private void boilWater(){

        System.out.println("将水煮沸");
    }

}
