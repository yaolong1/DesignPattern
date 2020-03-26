package com.yaolong.design.mode.strategy.yes;

/**
 * @program: DesignMode
 * @description: 具体算法实现，为新客户或者是普通客户计算应报的价格
 * @author: yaolong
 * @create: 2020-03-25 20:43
 **/
public class NormalCustomerStrategy implements Strategy{
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或者是普通客户，没有折扣");
        return goodsPrice;
    }
}
