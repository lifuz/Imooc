package com.lifuz.chain.handler;

/**
 * 价格处理人，负责处理客户折扣申请
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/22 18:17
 */
public abstract class PriceHandler {

    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }
    /**
     * 处理折扣申请
     */
    public abstract void processDiscount(float discount);

    /**
     * 创建PriceHandle 的工厂方法
     * @return
     */
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}
