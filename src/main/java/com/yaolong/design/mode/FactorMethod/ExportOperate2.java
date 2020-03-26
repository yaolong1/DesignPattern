package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-02-11 14:04
 **/
/**
 * 实现导出数据的业务功能对象
 */
public class ExportOperate2 {
    /**
     * 导出文件
     * @param type 用户选择的导出类型
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(int type,String data){
        //使用工厂方法
        ExportFileApi api = factoryMethod(type);
        return api.export(data);
    }
    /**
     * 工厂方法，创建导出的文件对象的接口对象
     * @param type 用户选择的导出类型
     * @return 导出的文件对象的接口对象
     */
    protected ExportFileApi factoryMethod(int type){
        ExportFileApi api = null;
        //根据类型来选择究竟要创建哪一种导出文件对象
        if(type==1){
            api = new ExportTextFile();
        }else if(type==2){
            api = new ExportDB();
        }
        return api;
    }
}