package com.yaolong.design.mode.iterator.simpleiterator;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-11 20:27
 **/
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代器对象的接口
     * @return 相应迭代器对象的接口
     */
    public abstract Iterator createIterator();
}
