package com.yaolong.design.mode.absfactory.no;

import com.yaolong.design.mode.absfactory.AMDCPU;
import com.yaolong.design.mode.absfactory.CPUApi;
import com.yaolong.design.mode.absfactory.IntelCPU;

/**
 * @program: DesignMode
 * @description: 创建 CPU 的简单工厂
 * @author: yaolong
 * @create: 2020-02-12 15:50
 **/
public class CPUFactory {
    /**
     * 创建 CPU 接口对象的方法
     * @param type 选择 CPU 类型的参数
     * @return CPU 接口对象的方法
     */
    public static CPUApi createCPUApi(int type){
        CPUApi cpu = null;
        //根据参数来选择并创建相应的 CPU 对象
        if(type==1){
            cpu = new IntelCPU(1156);
        }else if(type==2){
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
