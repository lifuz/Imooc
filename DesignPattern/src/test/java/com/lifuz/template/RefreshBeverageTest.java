package com.lifuz.template;

import org.junit.Test;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/26 11:29
 */
public class RefreshBeverageTest {


    @Test
    public void prepareBeverageTemplate() throws Exception {

        RefreshBeverage refreshBeverage = new Coffee();

        refreshBeverage.prepareBeverageTemplate();

        refreshBeverage = new Tea();

        refreshBeverage.prepareBeverageTemplate();

    }

}