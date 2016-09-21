package com.lifuz.adapter;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 18:33
 */
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug) {
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        plug.powerWithTwo();
    }
}
