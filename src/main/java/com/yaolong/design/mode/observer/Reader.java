package com.yaolong.design.mode.observer;

/**
 * @program: DesignMode
 * @description: 真正的读者 持有姓名
 * @author: yaolong
 * @create: 2020-03-13 21:32
 **/
public class Reader implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        String content = ((NewsPaper) subject).getContent();
        System.out.println(name+"当前订阅的报纸已经发布,请阅读，报纸的内容为"+content);
    }
}
