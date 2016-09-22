package com.lifuz.chain.handler;

/**
 * 销售总监，可以批准40%以内的折扣
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:24
 */
public class Director extends PriceHandler {


    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4) {
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
