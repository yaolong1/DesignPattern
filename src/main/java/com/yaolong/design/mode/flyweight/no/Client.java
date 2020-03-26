package com.yaolong.design.mode.flyweight.no;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-02-29 18:48
 **/
public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        boolean b = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");

        System.out.println("f1=="+b);
        System.out.println("f2=="+f2);
        for(int i=0;i<3;i++){
            mgr.login("张三"+i);
            mgr.hasPermit("张三"+i,"薪资数据","查看");
        }
    }
}
