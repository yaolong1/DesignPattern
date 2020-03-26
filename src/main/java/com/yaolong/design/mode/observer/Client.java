package com.yaolong.design.mode.observer;

/**
 * @program: DesignMode
 * @description: 客户端
 * @author: yaolong
 * @create: 2020-03-13 21:39
 **/
public class Client {
    public static void main(String[] args) {

        //报纸对象
        NewsPaper newsPaper = new NewsPaper();


        //读者
        Reader reader1 = new Reader();
        reader1.setName("小明");
        Reader reader2 = new Reader();
        reader2.setName("小化");
        Reader reader3 = new Reader();
        reader3.setName("小❀");
        Reader reader4 = new Reader();
        reader4.setName("小光");
        Reader reader5 = new Reader();
        reader5.setName("小华");

        //将订阅的读者注册进入报社
        newsPaper.register(reader1);
        newsPaper.register(reader2);
        newsPaper.register(reader3);
        newsPaper.register(reader4);
        newsPaper.register(reader5);

        newsPaper.setContent("本期阅读的内容是观察者模式");

    }
}
