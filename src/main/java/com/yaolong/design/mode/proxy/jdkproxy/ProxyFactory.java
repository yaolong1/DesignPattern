package com.yaolong.design.mode.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: DesignMode
 * @description: jdk代理(动态代理)
 * @author: yaolong
 * @create: 2020-03-03 10:05
 **/
public class ProxyFactory {

    /**
     * 维护对象
     */
    private ITeacherDAO teacherDAO;

    /**
     * 构造器初始化teacherDAO
     * @param teacherDAO
     */
    public ProxyFactory(ITeacherDAO teacherDAO){

        this.teacherDAO = teacherDAO;
    }


    /**
     * 生成代理对象
     * @return
     */
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(this.getClass().getClassLoader(), teacherDAO.getClass().getInterfaces(), (proxy,method,args) ->{
                if (method.getName().startsWith("teach2")){
                    if ("小明".equals(args[0])){
                        return method.invoke(teacherDAO, args);
                    }
                }else {
                    System.out.println("开始jdk代理");
                    Object invoke = method.invoke(teacherDAO, args);
                    System.out.println("结束jdk");
                    return invoke;
                }
                return null;
            });
    }

}
