package com.yaolong.design.mode.simplefactory;

import java.io.IOException;

/**
 * @program: DesignMode
 * @description: 简单工厂
 * @author: yaolong
 * @create: 2020-02-09 15:18
 **/
public class SimpleFactoryClient {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        Api impl = Factory.createApi2();
        impl.test();



    }
}


