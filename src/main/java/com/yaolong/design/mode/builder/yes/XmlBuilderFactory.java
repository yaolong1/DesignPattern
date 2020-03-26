package com.yaolong.design.mode.builder.yes;

/**
 * @program: DesignMode
 * @description: Xml导出方式导出工厂
 * @author: yaolong
 * @create: 2020-02-16 20:06
 **/
public class XmlBuilderFactory extends AbstractBuilderFactory {
    @Override
    protected Builder factoryMethod() {

        return new XmlBuilder();
    }
}
