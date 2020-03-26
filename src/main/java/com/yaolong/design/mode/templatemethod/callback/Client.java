package com.yaolong.design.mode.templatemethod.callback;

import com.yaolong.design.mode.templatemethod.LoginModel;
import com.yaolong.design.mode.templatemethod.LoginTemplate;
import com.yaolong.design.mode.templatemethod.NormalLogin;
import com.yaolong.design.mode.templatemethod.WorkerLogin;

import java.util.Collections;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-05 16:03
 **/
public class Client {
    public static void main(String[] args) {
        //准备登录人的信息
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin1");
        lm.setPwd("workerpwd");
        //准备用来进行判断的对象
        Template lt = new Template();
        //进行登录测试
        boolean flag = lt.login(lm, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel lm = new LoginModel();
                lm.setLoginId(loginId);
                lm.setPwd("workerpwd");
                return lm;
            }

            @Override
            public String encryptPwd(String pwd,Template template) {
                System.out.println("使用MD5加密");
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dbLm,Template template) {

                return template.match(lm,dbLm);
            }
        });
        System.out.println("可以登录工作平台="+flag);
    }
}