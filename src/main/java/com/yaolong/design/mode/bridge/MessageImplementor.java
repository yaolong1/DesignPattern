package com.yaolong.design.mode.bridge;

/**
 * @program: DesignMode
 * @description: 实现发送消息的统一接口
 * @author: yaolong
 * @create: 2020-02-20 21:08
 **/
public interface MessageImplementor {
        /**
         * 发送消息
         * @param message 要发送的消息内容
         * @param toUser 消息发送的目的人员
         */
        public void send(String message,String toUser);
}
