package com.yaolong.design.mode.memento;

/**
 * @program: DesignMode
 * @description: 负责保存模拟运行流程 A 的对象的备忘录对象
 * @author: yaolong
 * @create: 2020-03-20 09:25
 **/
public class FlowAMementoCareTaker {
    /**
     * 记录被保存的备忘录对象
     */
    private FlowAMockMemento memento = null;
    /**
     * 保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(FlowAMockMemento memento){
        this.memento = memento;
    }
    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public FlowAMockMemento retriveMemento(){
        return this.memento;
    }
}
