package com.yaolong.design.mode.absfactory;

import java.util.Calendar;

/**
 * @program: DesignMode
 * @description: 微星的主板
 * @author: yaolong
 * @create: 2020-02-12 15:50
 **/
public class MSIMainboard implements MainboardApi{
    /**
     * CPU 插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入 CPU 插槽的孔数
     * @param cpuHoles CPU 插槽的孔数
     */
    public MSIMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard,cpuHoles="
                +cpuHoles);

    }
}
