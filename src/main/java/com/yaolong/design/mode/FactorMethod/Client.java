package com.yaolong.design.mode.FactorMethod;

/**
 * @program: DesignMode
 * @description: 文件导出客户端
 * @author: yaolong
 * @create: 2020-02-10 12:22
// **/
public class Client {

    public static void main(String[] args) {

//        ExportOperate operate = new ExportTextFileOperate();
//        operate.export("我是文本文件导出");
//
//        ExportOperate operate1 = new ExportDBOperate();
//        operate1.export("我是DB导出");
//
//
//
//        ExportOperate2 operate2 = new ExportOperate2();
//        operate2.export(1,"Txt");


        ExportOperate2 operate3 = new ExportOperate3();
        operate3.export(1,"Txt");
        operate3.export(2,"DB");
        operate3.export(3,"xml");


    }

}
