package com.yaolong.design.mode.iterator.simpleiterator;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-11 20:07
 **/
public interface Iterator {
    public void first();
    public void next();
    public boolean isDone();
    public Object currentItem();
}
