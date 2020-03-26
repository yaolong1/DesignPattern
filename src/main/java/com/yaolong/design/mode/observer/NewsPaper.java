package com.yaolong.design.mode.observer;

/**
 * @program: DesignMode
 * @description: 报纸类继承Subject
 * @author: yaolong
 * @create: 2020-03-13 21:27
 **/
public class NewsPaper extends Subject {

    /**
     * 报纸内容
     */
    private String content;

    /**
     * 获取报纸的具体内容
     *
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置报纸的具体内容，出版报纸
     *
     * @return 报纸的具体内容
     */
    public void setContent(String content) {
        this.content = content;
        super.notifyObservers();
    }
}
