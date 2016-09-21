package com.lifuz.adapter;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 18:30
 */
public class NoteBook {

    private ThreePlugIf plugIf;

    public NoteBook(ThreePlugIf plugIf) {
        this.plugIf = plugIf;
    }

    /**
     * 使用插座充电
     */
    public void charge() {
        plugIf.powerWithThree();
    }
}
