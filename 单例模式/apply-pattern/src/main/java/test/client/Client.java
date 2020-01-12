package test.client;

import test.Singleton.AppConfigEHan;

/**
 * @program: DesignMode
 * @description: 客户端
 * @author: yaolong
 * @create: 2020-01-12 22:30
 **/
public class Client {

    public static void main(String[] args) {

        AppConfigEHan appConfigEHan = AppConfigEHan.getInstance();

        String parameterA = appConfigEHan.getParameterA();
        String parameterB = appConfigEHan.getParameterB();

        System.out.println(parameterA+parameterB);
    }
}
