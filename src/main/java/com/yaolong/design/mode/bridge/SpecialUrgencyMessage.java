package com.yaolong.design.mode.bridge;

/**
 * @program: DesignMode
 * @description: 特急消息的处理类
 * @author: yaolong
 * @create: 2020-02-20 22:03
 **/
public class SpecialUrgencyMessage extends AbstractMessage{
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }
    public void hurry(String messageId) {
        //执行催促的业务，发出催促的信息
    }
    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急："+message;
        super.sendMessage(message, toUser);
        //还需要增加一条待催促的信息
    }
}