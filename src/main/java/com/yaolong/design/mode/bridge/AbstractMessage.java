package com.yaolong.design.mode.bridge;

/**
 * @program: DesignMode
 * @description: 抽象的消息对象
 * @author: yaolong
 * @create: 2020-02-20 21:08
 **/
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;
    /**
     * 构造方法，传入实现部分的对象
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl){
        this.impl = impl;
    }
    /**
     * 发送消息，转调实现部分的方法
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    public void sendMessage(String message,String toUser){
        this.impl.send(message, toUser);
    }
}

