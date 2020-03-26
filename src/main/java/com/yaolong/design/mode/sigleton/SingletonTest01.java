package com.yaolong.design.mode.sigleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: DesignMode
 * @description: 单例模式饿汉式静态常量
 * @author: yaolong
 * @create: 2020-02-07 16:36
 **/
public class SingletonTest01 {
    public static void main(String[] args) {



//        Singleton07 instance1 = Singleton07.getInstance();
//        Singleton07 instance = Singleton07.getInstance();
//               System.out.println(instance == instance1);

        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance1 = Singleton8.INSTANCE;
        System.out.println(instance == instance1);
    }

}

/**
 * 饿汉式静态常量
 */
class Singleton01{

    private Singleton01(){

    }

    private final static Singleton01 singleton01 = new Singleton01();

    public static Singleton01 getInstance(){

        return singleton01;
    }

}

/**
 * 饿汉式静态代码快
 */
class Singleton02{
    private Singleton02(){

    }

    private final static Singleton02 singleton02;

    static {
        singleton02 = new Singleton02();
    }

    public static Singleton02 getInstance(){

        return singleton02;
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton03{
    private Singleton03(){

    }

    private  static Singleton03 singleton03;


    public static Singleton03 getInstance(){

        if (singleton03 != null){
            singleton03 = new Singleton03();
        }
        return singleton03;
    }
}

/**
 * 懒汉式（线程安全 同步方法）
 */
class Singleton04{
    private Singleton04(){

    }

    private  static Singleton04 singleton04;


    public static  Singleton04 getInstance(){

        Lock lock = new ReentrantLock();
        lock.lock();
            try {
                if (singleton04 != null){
                    singleton04 = new Singleton04();
                }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
        }
        return singleton04;

    }
}

/**
 * 懒汉式（线程安全 同步代码块）
 */
class Singleton05{
    private Singleton05(){

    }

    private  static Singleton05 singleton05;


    public static  Singleton05 getInstance(){

            if (singleton05 != null){

                synchronized(Singleton05.class){
                    singleton05 = new Singleton05();
                }

            }

        return singleton05;

    }
}

/**
 * 双重检查
 */
class Singleton06{
    private Singleton06(){

    }

    private  static volatile Singleton06 singleton06;


    public static  Singleton06 getInstance(){

        if (singleton06 != null){
            synchronized (Singleton06.class){
                if (singleton06 != null){
                    singleton06 = new Singleton06();
                }
            }
        }
        return singleton06;

    }
}

/**
 * 静态内部类
 */
class Singleton07{

    private Singleton07(){}

    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static  Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;

    }
}




enum Singleton8{

    INSTANCE;
    public void sayHello(){
        System.out.println("hello");
    }

}