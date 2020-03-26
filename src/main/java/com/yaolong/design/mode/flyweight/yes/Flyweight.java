package com.yaolong.design.mode.flyweight.yes;


/**
 * 描述收钱数据的享元接口
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和权限与享元对象内部状态是否匹配
     * @param securityEntity 安全实体
     * @param permit 权限
     * @return
     */
    public boolean match(String securityEntity,String permit);

}
