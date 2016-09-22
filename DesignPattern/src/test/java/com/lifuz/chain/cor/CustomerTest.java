package com.lifuz.chain.cor;

import com.lifuz.chain.handler.PriceHandler;
import com.lifuz.chain.handler.PriceHandlerFactory;
import org.junit.Test;

import java.util.Random;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:33
 */
public class CustomerTest {

    @Test
    public void requestDiscount() throws Exception {

        Customer customer = new Customer();

        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();

        for (int i = 0 ; i < 50 ;i++) {
            System.out.print(i + ":");

            customer.requestDiscount(random.nextFloat());
        }

    }

}