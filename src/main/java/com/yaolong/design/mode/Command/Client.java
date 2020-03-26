package com.yaolong.design.mode.Command;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-08 16:51
 **/
public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();
        Command addCommand = new AddCommand(operation,1);
        Command subtractCommand = new SubtractCommand(operation,2);
        Calculator calculator = new Calculator();

        calculator.setAddCmd(addCommand);
        calculator.addPressed();
        System.out.println("加了之后:"+operation.getResult());

        calculator.setSubstractCmd(subtractCommand);
        calculator.substractPressed();
        System.out.println("减了之后:"+operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销上一步之后:"+operation.getResult());
        calculator.redoPressed();
        System.out.println("恢复上一步之后:"+operation.getResult());

    }
}
