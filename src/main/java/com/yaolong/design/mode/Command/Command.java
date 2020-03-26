package com.yaolong.design.mode.Command;


/**
 * @program: DesignMode
 * @description: 命令接口，声明执行的操作，支持可撤销操作
 * @author: yaolong
 * @create: 2020-03-08 16:32
 **/
public interface Command {
    /**
     * 执行命令对应的操作
     */
    public void execute();

    /**
     * 执行撤销命令对应的操作
     */
    public void undo();
}
