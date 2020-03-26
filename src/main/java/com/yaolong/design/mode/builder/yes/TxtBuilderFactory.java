package com.yaolong.design.mode.builder.yes;

/**
 * @program: DesignMode
 * @description: txt导出方式导出工厂
 * @author: yaolong
 * @create: 2020-02-16 20:06
 **/
public class TxtBuilderFactory extends AbstractBuilderFactory {
    @Override
    protected Builder factoryMethod() {

        return new TxtBuilder();
    }
}
