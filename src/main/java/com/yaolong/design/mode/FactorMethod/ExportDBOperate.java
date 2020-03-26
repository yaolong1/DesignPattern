package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 使用DB导出文件
 * @author: yaolong
 * @create: 2020-02-10 12:09
 **/
public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {

        return new ExportDB();
    }
}
