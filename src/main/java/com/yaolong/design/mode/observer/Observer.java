package com.yaolong.design.mode.observer;

/**
 * @program: DesignMode
 * @description: 观察者-这里代表的是订阅者
 * @author: yaolong
 * @create: 2020-03-13 21:17
 **/
public interface Observer {

    /**
     * 被目标对象通知的方法
     * @param subject
     */
    public void update(Subject subject);
}
