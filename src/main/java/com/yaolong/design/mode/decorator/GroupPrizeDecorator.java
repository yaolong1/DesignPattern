package com.yaolong.design.mode.decorator;


import java.util.Date;
/**
 * @program: DesignMode
 * @description: 装饰器对象，计算当月团队业务奖金
 * @author: yaolong
 * @create: 2020-02-23 10:30
 **/
public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double
    calcPrize(String user, Date begin, Date end) {
        //1：先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //2：然后计算当月团队业务奖金，先计算出团队总的业务额，然后再乘以 1%
        //假设都是一个团队的
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return money + prize;
    }
}