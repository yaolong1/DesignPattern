package com.yaolong.design.mode.prototype.yes;

/**
 * @program: DesignMode
 * @description: 企业订单
 * @author: yaolong
 * @create: 2020-02-14 18:39
 **/
public class EnterpriseOrder implements OrderApi,Cloneable {
    /**
     * 企业名称
     */
    private String enterpriseName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        return "本企业订单的订购企业是=" + this.enterpriseName
                + "，订购产品是=" + this.productId + "，订购数量为="
                + this.orderProductNum;

    }

    @Override
    public Object clone() {
        EnterpriseOrder obj = null;
        try {
            obj = (EnterpriseOrder)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

