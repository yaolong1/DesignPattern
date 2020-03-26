package com.yaolong.design.mode.strategy.yes;

/**
 * @program: DesignMode
 * @description: 策略，定义计算报价算法的接口
 * @author: yaolong
 * @create: 2020-03-25 20:39
 **/

public interface Strategy {
    /**
     * 计算应报的价格
     *
     * @param goodsPrice 商品销售原价
     * @return 计算出来的，应该给客户报的价格
     */
    public double calcPrice(double goodsPrice);
}
