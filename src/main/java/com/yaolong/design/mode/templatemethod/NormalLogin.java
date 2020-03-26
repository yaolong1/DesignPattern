package com.yaolong.design.mode.templatemethod;

/**
 * @program: DesignMode
 * @description: 普通用户登录控制的逻辑处理
 * @author: yaolong
 * @create: 2020-03-05 16:01
 **/
public class NormalLogin extends LoginTemplate{
    @Override
    public LoginModel findLoginUser(String loginId) {
        // 这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        return lm;

    }
}