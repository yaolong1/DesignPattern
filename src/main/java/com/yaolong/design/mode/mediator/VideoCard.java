package com.yaolong.design.mode.mediator;

/**
 * @program: DesignMode
 * @description: 显卡类，同事类
 * @author: yaolong
 * @create: 2020-03-15 22:36
 **/
public class VideoCard extends Colleague{
    public VideoCard(Mediator mediator) {
        super(mediator);
    }
    /**
     * 显示视频数据
     * @param data 被显示的数据
     */
    public void showData(String data){
        System.out.println("您正观看的是："+data);
    }
}
