package com.yaolong.design.mode.flyweight.yes;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignMode
 * @description: 享元工厂，通常实现成为单例
 * @author: yaolong
 * @create: 2020-03-01 11:05
 **/
public class FlyweightFactory {

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private FlyweightFactory(){
    }

    /**
     * 单例
     * @return
     */
    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }
    /**
     *
     * 缓存多个享元对象(享元对象池)
     */
    private Map<String,Flyweight> map = new HashMap<>();
    /**
     * 外部获取Flyweight
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = map.get(key);

        //如果享元对象池中没有享元对象，就创建一个并放入池中
        if(null == flyweight){
            flyweight = new AuthorizationFlyweight(key);
            map.put(key,flyweight);
        }
        return flyweight;

    }

}
