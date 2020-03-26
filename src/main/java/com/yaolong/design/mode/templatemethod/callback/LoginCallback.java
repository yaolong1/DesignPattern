package com.yaolong.design.mode.templatemethod.callback;

import com.yaolong.design.mode.templatemethod.LoginModel;

/**
 * @program: DesignMode
 * @description: 默认回调
 * @author: yaolong
 * @create: 2020-03-05 19:06
 **/
public interface LoginCallback {

    public  LoginModel findLoginUser(String loginId);
    public String encryptPwd(String pwd,Template template);
    public boolean match(LoginModel lm, LoginModel dbLm,Template template);

}
