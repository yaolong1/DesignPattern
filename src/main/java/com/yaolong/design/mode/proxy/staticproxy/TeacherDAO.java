package com.yaolong.design.mode.proxy.staticproxy;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-03 09:53
 **/

public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach(){
        System.out.println("静态代理开始授课。。");
    }
}
