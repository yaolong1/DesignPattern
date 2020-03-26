package com.yaolong.design.mode.ChainofResponsibility.no;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-26 11:01
 **/
public class Client {
    public static void main(String[] args) {
        FeeRequest request = new FeeRequest();

        //开始测试
        String ret1 = request.requestToProjectManager("小李", 300);
        System.out.println("the ret="+ret1);
        String ret2 = request.requestToProjectManager("小张", 300);
        System.out.println("the ret="+ret2);

        String ret3 = request.requestToProjectManager("小李", 600);
        System.out.println("the ret="+ret3);
        String ret4 = request.requestToProjectManager("小张", 600);
        System.out.println("the ret="+ret4);

        String ret5 = request.requestToProjectManager("小李", 1200);
        System.out.println("the ret="+ret5);
        String ret6 = request.requestToProjectManager("小张", 1200);
        System.out.println("the ret="+ret6);
    }
}
