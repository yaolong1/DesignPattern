package com.yaolong.design.mode.absfactory;

import com.yaolong.design.mode.absfactory.yes.AbstractFactory;
import com.yaolong.design.mode.absfactory.yes.ComputerEngineer;
import com.yaolong.design.mode.absfactory.yes.Schema1;
import com.yaolong.design.mode.absfactory.yes.Schema2;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-02-12 15:53
 **/
public class Client {
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();

        AbstractFactory schema = new Schema2();

        //告诉装机工程师自己选择的配件，让装机工程师组装电脑
        engineer.makeComputer(schema);



    }
}