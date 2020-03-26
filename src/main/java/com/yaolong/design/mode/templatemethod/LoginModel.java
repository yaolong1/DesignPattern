package com.yaolong.design.mode.templatemethod;

/**
 * @program: DesignMode
 * @description: 封装进行登录控制所需要的数据
 * @author: yaolong
 * @create: 2020-03-05 15:59
 **/
public class LoginModel {
    /**
     * 登录人员的编号，通用的，可能是用户编号，也可能是工作人员编号
     */
    private String loginId;
    /**
     * 登录的密码
     */
    private String pwd;
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}