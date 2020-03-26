package com.yaolong.design.mode.mediator;

/**
 * @program: DesignMode
 * @description: 测试一下看电影
 * @author: yaolong
 * @create: 2020-03-15 22:40
 **/
public class Client {
    public static void main(String[] args) {
        //创建一个主板类
        MotherBoard motherBoard = new MotherBoard();

        //创建同事类
        CPU cpu = new CPU(motherBoard);
        CDDriver cdDriver = new CDDriver(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);


        //让中介者知道所有同事类
        motherBoard.setCdDriver(cdDriver);
        motherBoard.setCpu(cpu);
        motherBoard.setSoundCard(soundCard);
        motherBoard.setVideoCard(videoCard);


        //将光盘放入光驱开始播放
        cdDriver.readCD();

    }
}
