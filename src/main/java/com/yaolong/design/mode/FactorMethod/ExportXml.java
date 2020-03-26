package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 使用Xml方式导出
 * @author: yaolong
 * @create: 2020-02-11 14:07
 **/
public class ExportXml implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("将数据===="+data+"====导出到xml文件");
        return true;
    }
}
