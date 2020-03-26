package com.yaolong.design.mode.decorator;

import java.util.Date;

/**
 * @program: DesignMode
 * @description: 基本的实现计算奖金的类，也是被装饰器装饰的对象
 * @author: yaolong
 * @create: 2020-02-23 10:21
 **/
public class ConcreteComponent extends Component{
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}