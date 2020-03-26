package com.yaolong.design.mode.interpreter;


import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-22 09:09
 **/
public class XmlUtil {
    public static Document getRoot(String filePathName) throws Exception{
        Document doc = null;
        //建立一个解析器工厂

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //获得一个 DocumentBuilder 对象，这个对象代表了具体的 Dom 解析器
        DocumentBuilder builder=factory.newDocumentBuilder();
        //得到一个表示 xml 文档的 Document 对象
        doc=builder.parse(filePathName);
        //去掉xml文档中作为格式化内容的空白而映射在Dom树中的TextNode对象
        doc.normalize();
        return doc;
    }
}
