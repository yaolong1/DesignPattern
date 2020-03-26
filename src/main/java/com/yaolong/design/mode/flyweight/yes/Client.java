package com.yaolong.design.mode.flyweight.yes;

import com.yaolong.design.mode.flyweight.yes.SecurityMgr;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-02-29 18:48
 **/
public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getSecurityMgr();
        mgr.login("张三");
        mgr.login("李四");
        mgr.login("王五");
        boolean f1 = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");
        boolean f3 = mgr.hasPermit("王五","人员列表","添加");


        System.out.println("f1=="+f1);
        System.out.println("f2=="+f2);
        System.out.println("f3=="+f3);
        for(int i=0;i<3;i++){
            mgr.login("张三"+i);
            mgr.hasPermit("张三"+i,"薪资数据","查看");
        }
    }
}