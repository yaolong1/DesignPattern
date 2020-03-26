package com.yaolong.design.mode.absfactory.yes;

import com.yaolong.design.mode.absfactory.CPUApi;
import com.yaolong.design.mode.absfactory.MainboardApi;
import com.yaolong.design.mode.absfactory.no.CPUFactory;
import com.yaolong.design.mode.absfactory.no.MainboardFactory;

/**
 * @program: DesignMode
 * @description: 装机工程师的类
 * @author: yaolong
 * @create: 2020-02-12 15:52
 **/
public class ComputerEngineer {
    /**
     * 定义组装机器需要的 CPU
     */
    private CPUApi cpu = null;
    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 装机过程
     *
     * @param schema 客户选择所需 方案类型
     */
    public void makeComputer(AbstractFactory schema) {
        //1：首先准备好装机所需要的配件
        prepareHardwares(schema);
        //2：组装机器
        //3：测试机器
        //4：交付客户
    }

    /**
     * 准备装机所需要的配件
     *
     * @param schema 客户选择所需 方案类型
     *
     */
    private void prepareHardwares(AbstractFactory schema) {
        //这里要去准备 CPU 和主板的具体实现，为了示例简单，这里只准备这两个
        //可是，装机工程师并不知道如何去创建，怎么办呢？

        //直接找相应的工厂获取
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboard = (MainboardApi) schema.createProduct(2);
        //测试一下配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}