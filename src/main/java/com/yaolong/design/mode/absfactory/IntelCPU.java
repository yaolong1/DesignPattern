package com.yaolong.design.mode.absfactory;

/**
 * @program: DesignMode
 * @description: Intel 的 CPU 实现
 * @author: yaolong
 * @create: 2020-02-12 15:48
 **/

public class IntelCPU implements CPUApi{
    /**
     * CPU 的针脚数目
     */
    private int pins = 0;
    /**
     * 构造方法，传入 CPU 的针脚数目
     * @param pins CPU 的针脚数目
     */
    public IntelCPU(int pins){
        this.pins = pins;
    }
    public void calculate() {
        System.out.println("now in Intel CPU,pins="+pins);
    }
}