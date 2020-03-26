package com.yaolong.design.mode.visitor;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-09 18:12
 **/
public class EnterpriseCustomer extends Customer{
    private String linkman;
    private String linkTelephone;
    private String registerAddress;

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    /**
     * 此方法具体的实现延伸到访问者中，相当于一个通用的方法
     * @param visitor 访问者对象
     */
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitEnterpriseCustomer(this);
    }
}
