package com.yaolong.design.mode.prototype.yes;

/**
     * @program: DesignMode
     * @description: 个人订单
     * @author: yaolong
     * @create: 2020-02-14 18:36
     **/
    public class PersonalOrder implements OrderApi,Cloneable {


        /**
         * 订购人员姓名
         */
        private String customerName;
        /**
         * 产品编号
         */
        private String productId;
        /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public String toString() {
        return "本个人订单的订购人是=" + this.customerName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;
    }

    @Override
    public Object clone() {
        PersonalOrder obj = null;
        try {
            obj = (PersonalOrder)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
