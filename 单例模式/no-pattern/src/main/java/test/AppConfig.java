package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取应用配置文件
 */
public class AppConfig {
    /**
     * 用来存放配置文件中参数 A 的值
     */
    private String parameterA;
    /**
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
     注意：只有访问参数的方
     法，没有设置参数的方法
     第5章 单例模式（Singleton）
     * 构造方法
     */
    public AppConfig(){
        //调用读取配置文件的方法
        readConfig();
    }
    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig(){
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("AppConfig.properties");
            p.load(in);
            //把配置文件中的内容读出来设置到属性上
            this.parameterA = p.getProperty("paramA");
            this.parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}