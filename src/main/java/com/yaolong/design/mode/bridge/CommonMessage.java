package com.yaolong.design.mode.bridge;

/**
 * @program: DesignMode
 * @description: 普通消息的处理类
 * @author: yaolong
 * @create: 2020-02-20 21:33
 **/
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }
    @Override
    public void sendMessage(String message, String toUser) {
        //对于普通消息，什么都不干，直接调用父类的方法，把消息发送出去就可以了
        super.sendMessage(message, toUser);
    }
}
