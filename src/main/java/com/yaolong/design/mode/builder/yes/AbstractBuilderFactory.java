package com.yaolong.design.mode.builder.yes;

/**
 * @program: DesignMode
 * @description:  工厂方法
 * @author: yaolong
 * @create: 2020-02-16 19:41
 **/
public abstract class AbstractBuilderFactory {


    public Builder getMyBuilder(){
        return factoryMethod();
    }


    /**
     *  工厂方法
     * @return Builder
     */
    protected  abstract Builder factoryMethod();
}
