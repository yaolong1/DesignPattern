package com.yaolong.design.mode.proxy.staticproxy;

/**
 * @program: DesignMode
 * @description: 客户端
 * @author: yaolong
 * @create: 2020-03-03 09:58
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDAO proxyFactory = new ProxyFactory(new TeacherDAO());
        proxyFactory.teach();
    }


}
