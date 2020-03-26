package com.yaolong.design.mode.visitor;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-09 18:28
 **/
public class Cilent {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        Customer c1 = new EnterpriseCustomer();
        c1.setName("AB集團");
        structure.addElement(c1);

        Customer c2 = new PersonalCustomer();
        c2.setName("小明");
        structure.addElement(c2);


        //创建服务请求访问者
        Visitor visitor = new ServiceRequestVisitor();
        structure.handleRequest(visitor);

        //创建产品偏好分析
        Visitor visitor1 = new PredilectionAnalyzeVisitor();
        structure.handleRequest(visitor1);


    }

}
