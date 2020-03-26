package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 文件导出方式
 * @author: yaolong
 * @create: 2020-02-10 12:02
        **/
public class ExportTextFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("将数据===="+data+"====导出到文本文件");
        return true;
    }
}
