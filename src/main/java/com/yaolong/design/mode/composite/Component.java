package com.yaolong.design.mode.composite;

/**
 * @program: DesignMode
 * @description: 抽象的组件对象
 * @author: yaolong
 * @create: 2020-02-26 14:50
 **/
public abstract class Component {
    /**
     * 输出组件自身的名称
     */
    public abstract void printStruct(String preStr);
    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 从组合对象中移出某个组件对象
     * @param child 被移出的组件对象
     */
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 返回某个索引对应的组件对象相当于模式示例代码中的样例方法没有改变，和模式示例代码一样
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对应的组件对象
     */
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}