package com.yaolong.design.mode.visitor.componentandvisitor;

/**
 * @program: DesignMode
 * @description: 具体的访问者，实现：输出对象的名称，在组合对象的名称前面添加"节点："
 * 在叶子对象的名称前面添加"叶子："
 * @author: yaolong
 * @create: 2020-03-09 23:13
 **/
public class PrintNameVisitor implements Visitor {
    @Override
    public void visitComposite(Composite composite) {
        //访问到组合对象的数据
        System.out.println("节点：" + composite.getName());
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        //访问到叶子对象的数据
        System.out.println("叶子：" + leaf.getName());
    }

}