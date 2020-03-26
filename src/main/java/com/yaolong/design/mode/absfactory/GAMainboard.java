package com.yaolong.design.mode.absfactory;

/**
 * @program: DesignMode
 * @description: 技嘉的主板
 * @author: yaolong
 * @create: 2020-02-12 15:49
 **/
public class GAMainboard implements MainboardApi {
    /**
     * CPU 插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入 CPU 插槽的孔数
     * @param cpuHoles CPU 插槽的孔数
     */
    public GAMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    public void installCPU() {
        System.out.println("now in GAMainboard,cpuHoles="
                +cpuHoles);
    }
}