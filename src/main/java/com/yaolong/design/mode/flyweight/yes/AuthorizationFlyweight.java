package com.yaolong.design.mode.flyweight.yes;

/**
 * @program: DesignMode
 * @description: 封装授权数据中重复出现部分的享元对象
 * @author: yaolong
 * @create: 2020-03-01 10:56
 **/
public class AuthorizationFlyweight implements Flyweight {

    /**
     * 内部状态，安全实体
     */
    private String securityEntity;
    /**
     * 内部状态，权限
     */
    private String permit;

    public AuthorizationFlyweight(String data) {
        String[] split = data.split(",");
        this.securityEntity = split[0];
        this.permit = split[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity) && this.permit.equals(permit)) {
            return true;
        }
        return false;
    }
}
