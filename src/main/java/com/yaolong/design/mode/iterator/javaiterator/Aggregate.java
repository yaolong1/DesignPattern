package com.yaolong.design.mode.iterator.javaiterator;

import java.util.Iterator;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-12 10:20
 **/

public abstract class Aggregate {
    public abstract Iterator createIterator();
}
