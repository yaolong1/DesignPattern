package com.yaolong.design.mode.Command;

/**
 * @program: DesignMode
 * @description: 命令接受者（Received）  运算类，真正实现加减法运算
 * @author: yaolong
 * @create: 2020-03-08 16:32
 **/
public class Operation implements OperationApi {
    /**
     * 记录运算的结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        //实现加法功能
        result += num;
    }

    @Override
    public void substract(int num) {
        //实现减法功能
        result -= num;
    }
}