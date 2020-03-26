package com.yaolong.design.mode.interpreter;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-22 09:13
 **/
public class Client {
    public static void main(String[] args) throws Exception {
        //准备上下文
        Context c = new Context("C:\\javaSEProject\\DesignMode\\src\\main\\resorces\\InterpreterTest.xml");
        //想要获取 c 元素的值，也就是如下表达式的值："root/a/b/c"
        //首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("database-connection");
        ElementTerminalExpression bEle = new ElementTerminalExpression("connection-type");

        //组合起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        //调用
        String ss[] = root.interpret(c);
        System.out.println("c的值是="+ss[0]);
    }

}
