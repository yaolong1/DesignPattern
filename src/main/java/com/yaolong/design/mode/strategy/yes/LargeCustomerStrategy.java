package com.yaolong.design.mode.strategy.yes;

/**
 * @program: DesignMode
 * @description: 具体算法实现，为大客户计算应报的价格
 * @author: yaolong
 * @create: 2020-03-25 20:46
 **/
public class LargeCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * (1 - 0.1);
    }
}
