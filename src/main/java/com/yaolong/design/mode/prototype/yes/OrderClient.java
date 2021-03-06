package com.yaolong.design.mode.prototype.yes;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-02-14 19:22
 **/
public class OrderClient {
    public static void main(String[] args) {
        //创建订单对象，这里为了演示简单，直接 new 了
        PersonalOrder op = new PersonalOrder();
        //设置订单数据
        op.setOrderProductNum(7925);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        PersonalOrder op2 = (PersonalOrder)op.clone();
        op.setOrderProductNum(7925);
        op.setCustomerName("张三2");
        op.setProductId("P0002");


        System.out.println("原型"+op);
        System.out.println("克隆"+op2);
        System.out.println("原型"+op);

//       //这里获取业务处理的类，也直接 new 了，为了简单，连业务接口都没有做
//        OrderBusiness ob = new OrderBusiness();
//        //调用业务来保存订单对象
//        ob.saveOrder(op);
    }
}