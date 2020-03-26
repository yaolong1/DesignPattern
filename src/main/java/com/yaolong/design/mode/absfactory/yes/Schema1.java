package com.yaolong.design.mode.absfactory.yes;

import com.yaolong.design.mode.absfactory.GAMainboard;
import com.yaolong.design.mode.absfactory.IntelCPU;
import com.yaolong.design.mode.absfactory.yes.AbstractFactory;

/**
 * @program: DesignMode
 * @description: 方案一
 * @author: yaolong
 * @create: 2020-02-12 16:13
 * 装机方案一：Intel 的 CPU + 技嘉的主板
 * 这里创建 CPU 和主板对象的时候，是对应的，能匹配上的
 */
public class Schema1 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        //type 为 1 表示创建 CPU，type 为 2 表示创建主板
        if(type==1){
            retObj = new IntelCPU(1156);
        }else if(type==2){
            retObj = new GAMainboard(1156);
        }
        return retObj;
    }
}