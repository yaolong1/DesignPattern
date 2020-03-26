package com.yaolong.design.mode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignMode
 * @description: 目标对象，被观察者
 * @author: yaolong
 * @create: 2020-03-13 21:14
 **/
public class Subject {

    /**
     * 用于保存注册的观察者对象，也就是订阅者
     */
   private List<Observer> readers = new ArrayList<>();


    /**
     * 报纸的读者要先向报社注册才能够订阅报纸
     * @param observer
     */
   public void register(Observer observer){
       readers.add(observer);
   }

    /**
     * 取消订阅
     * @param observer
     */
   public void detach(Observer observer){
      readers.remove(observer);
   }

    /**
     * 当每期报纸印刷出来后，就要迅速主动地被送到读者的手中
     * 相当于通知读者，让他们知道
     */
    protected void notifyObservers() {
        for(Observer reader : readers){
            reader.update(this);
        }
    }
}
