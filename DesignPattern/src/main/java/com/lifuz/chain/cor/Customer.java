package com.lifuz.chain.cor;

import com.lifuz.chain.handler.PriceHandler;

/**
 * 客户，请求折扣
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:28
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){

        priceHandler.processDiscount(discount);

    }
}
