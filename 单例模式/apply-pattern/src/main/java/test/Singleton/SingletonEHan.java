package test.Singleton;

/**
 * @program: DesignMode
 * @description: 饿汉式单例模式
 * @author: yaolong
 * @create: 2020-01-12 22:26
 **/
public class SingletonEHan {
    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
     */
    private static SingletonEHan uniqueInstance = new SingletonEHan();
    /**
     * 私有化构造方法，可以在内部控制创建实例的数目
     */
    private SingletonEHan(){
        //
    }
    /**
     * 定义一个方法来为客户端提供类实例
     * @return 一个 Singleton 的实例
     */
    public static SingletonEHan getInstance(){
        //直接使用已经创建好的实例
        return uniqueInstance;
    }

    /**
     * 示意方法，单例可以有自己的操作
     */
    public void singletonOperation(){
        //功能处理
    }
    /**
     * 示意属性，单例可以有自己的属性
     */
    private String singletonData;
    /**
     * 示意方法，让外部通过这些方法来访问属性的值
     * @return 属性的值
     */
    public String getSingletonData(){
        return singletonData;
    }
}