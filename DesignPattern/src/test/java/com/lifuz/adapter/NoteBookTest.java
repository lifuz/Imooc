package com.lifuz.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 18:32
 */
public class NoteBookTest {

    @Test
    public void charge() throws Exception {

        GBTwoPlug twoPlug = new GBTwoPlug();

        ThreePlugIf plugIf = null;
        plugIf = new TwoPlugAdapter(twoPlug);
        NoteBook noteBook = new NoteBook(plugIf);
        noteBook.charge();

        noteBook = new NoteBook(new TwoPlugAdapterExtends());
        noteBook.charge();

    }

}