package com.yaolong.design.mode.interpreter;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: DesignMode
 * @description: 元素作为非终结符对应的解释器，解释并执行中间元素
 * @author: yaolong
 * @create: 2020-03-22 09:11
 **/
public class ElementExpression extends ReadXmlExpression {
    /**
     * 用来记录组合的 ReadXmlExpression 元素
     */
    private Collection<ReadXmlExpression> eles = new ArrayList<>();
    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context c) {
        //先取出上下文中的当前元素作为父级元素
        //查找到当前元素名称所对应的 xml 元素，并设置回到上下文中
        Element pEle = c.getPreEle();
        if (pEle == null) {
            //说明现在获取的是根元素
            c.setPreEle(c.getDocument().getDocumentElement());
        } else {
            //根据父级元素和要查找的元素的名称来获取当前的元素
            Element nowEle = c.getNowEle(pEle, eleName);
            //把当前获取的元素放到上下文中
            c.setPreEle(nowEle);
        }

        //循环调用子元素的 interpret 方法
        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }
}
