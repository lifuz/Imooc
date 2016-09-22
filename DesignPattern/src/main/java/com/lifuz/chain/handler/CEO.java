package com.lifuz.chain.handler;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:26
 */
public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.5) {
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        } else {
            System.out.format("%s拒绝了折扣：%.2f%n",this.getClass().getName(),discount);
        }
    }
}
