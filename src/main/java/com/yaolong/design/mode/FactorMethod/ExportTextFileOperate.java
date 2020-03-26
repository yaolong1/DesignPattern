package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 使用文件导出的抽象工厂子类
 * @author: yaolong
 * @create: 2020-02-10 12:05
 **/
public class ExportTextFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
