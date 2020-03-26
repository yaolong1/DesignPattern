//package com.yaolong.design.mode.proxy.cglibproxy;
//
//import com.yaolong.design.mode.proxy.jdkproxy.ITeacherDAO;
//import com.yaolong.design.mode.proxy.jdkproxy.ProxyFactory;
//
///**
// * @program: DesignMode
// * @description: 客户端
// * @author: yaolong
// * @create: 2020-03-03 09:58
// **/
//public class Client {
//    public static void main(String[] args) {
//        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDAO());
//        ITeacherDAO proxyInstance = (ITeacherDAO) proxyFactory.getProxyInstance();
//        proxyInstance.teach2("小红");
//        proxyInstance.teach2("小花");
//        proxyInstance.teach2("小明");
//        proxyInstance.teach();
//    }
//
//
//}
