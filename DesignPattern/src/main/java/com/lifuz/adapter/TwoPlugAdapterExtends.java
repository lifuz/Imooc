package com.lifuz.adapter;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 18:39
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        System.out.println("借助继承的方式");
        this.powerWithTwo();
    }
}
