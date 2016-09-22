package com.lifuz.chain.handler;

/**
 *
 * 销售可以批准 5%以内
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:20
 */
public class Sales extends PriceHandler {


    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05) {
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        } else {
            successor.processDiscount(discount);
        }
    }


}
