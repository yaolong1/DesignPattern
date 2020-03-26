package com.yaolong.design.mode.bridge;

/**
 * @program: DesignMode
 * @description: 以 E-mail 的方式发送消息
 * @author: yaolong
 * @create: 2020-02-20 21:11
 **/
public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方式，发送消息'" +message+"'给"+toUser);
    }
}