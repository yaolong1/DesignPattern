package com.yaolong.design.mode.proxy.staticproxy;

/**
 * @program: DesignMode
 * @description: 静态代理工厂
 * @author: yaolong
 * @create: 2020-03-03 09:55
 **/
public class ProxyFactory implements ITeacherDAO {

    private ITeacherDAO teacherDAO;


    public ProxyFactory(ITeacherDAO teacherDAO){
        this.teacherDAO = teacherDAO;
    }

    @Override
    public void teach() {
        System.out.println("开始代理。。。。。");
        teacherDAO.teach();
        System.out.println("代理结束。。。。。");
    }
}
