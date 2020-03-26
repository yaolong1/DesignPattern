package com.yaolong.design.mode.decorator;

import java.util.Date;

/**
 * @program: DesignMode
 * @description: 装饰器的接口，需要和被装饰的对象实现同样的接口
 * @author: yaolong
 * @create: 2020-02-23 10:25
 **/
public abstract class Decorator extends Component{
    /**
     * 持有被装饰的组件对象
     */
    protected Component c;
    /**
     * 通过构造方法传入被装饰的对象
     * @param c 被装饰的对象
     */
    public Decorator(Component c){
        this.c = c;
    }
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return c.calcPrize(user, begin, end);
    }
}