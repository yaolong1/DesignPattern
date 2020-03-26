package com.yaolong.design.mode.absfactory.yes;

import com.yaolong.design.mode.absfactory.AMDCPU;
import com.yaolong.design.mode.absfactory.MSIMainboard;
import com.yaolong.design.mode.absfactory.yes.AbstractFactory;

/**
 * @program: DesignMode
 * @description: 方案二
 * @author: yaolong
 * @create: 2020-02-12 16:15
 * 装机方案二：AMD 的 CPU + 微星的主板
 * 这里创建 CPU 和主板对象的时候，是对应的，能匹配上的
 */
public class Schema2 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        //type 为 1 表示创建 CPU，type 为 2 表示创建主板
        if(type==1){
            retObj = new AMDCPU(939);
        }else if(type==2){
            retObj = new MSIMainboard(939);
        }
        return retObj;
    }
}