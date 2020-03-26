package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 数据库导出方式
 * @author: yaolong
 * @create: 2020-02-10 12:03
 **/
public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("将数据===="+data+"====导出到DB");
        return true;
    }
}
