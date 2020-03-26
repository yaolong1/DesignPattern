package com.yaolong.design.mode.proxy.cglibproxy;



/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-03 09:53
 **/

public class TeacherDAO {
    public void teach(){
        System.out.println("静态代理开始授课。。");
    }

    public void teach2(String data) {
        System.out.println("静态代理开始授课。。"+data);
    }
}
