package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 抽象工厂
 * @author: yaolong
 * @create: 2020-02-10 12:04
 **/
public abstract class ExportOperate {


    /**
     * 导出文件
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(String data){

        ExportFileApi api = factoryMethod();

        return api.export(data);
    }


    /**
     * @return ExportFileApi
     * @deprecated 工厂方法 创建导出的文件对象的接口对象
     */
    protected abstract ExportFileApi factoryMethod();


}
