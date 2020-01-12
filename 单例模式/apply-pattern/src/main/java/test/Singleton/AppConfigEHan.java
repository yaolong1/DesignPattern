package test.Singleton;

/**
 * @program: DesignMode
 * @description: 饿汉式读取应用配置文件
 * @author: yaolong
 * @create: 2020-01-12 22:37
 **/

import test.AppConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取应用配置文件，单例实现
 */
public class AppConfigEHan {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
     */
    private static AppConfigEHan instance = new AppConfigEHan();

    /**
     * 定义一个方法来为客户端提供 AppConfig 类的实例
     *
     * @return 一个 AppConfig 的实例
     */
    public static AppConfigEHan getInstance() {
        return instance;
    }

    /**
     * 用来存放配置文件中参数 A 的值
     */
    private String parameterA;
    /**
     * 而是等到第一次使用的时候，才去创建实例，也就是在 getInstance 方法里面去判
     * 断和创建
     * 延
     * 伸
     * 第5章 单例模式（Singleton）
     * 81
     * 用来存放配置文件中参数 B 的值
     */
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    /**
     * 私有化构造方法
     */
    private AppConfigEHan() {
        //调用读取配置文件的方法
        readConfig();
    }

    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfigEHan.class.getResourceAsStream(
                    "../AppConfig.properties");
            p.load(in);
            //把配置文件中的内容读出来设置到属性上
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}