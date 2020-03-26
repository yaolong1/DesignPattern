package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 新增xml导出的工厂
 * @author: yaolong
 * @create: 2020-02-11 14:08
 **/
public class ExportOperate3 extends ExportOperate2 {

    @Override
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;

        if (type == 3){
            api = new ExportXml();
        }else {
            api = super.factoryMethod(type);
        }

        return api;
    }
}
