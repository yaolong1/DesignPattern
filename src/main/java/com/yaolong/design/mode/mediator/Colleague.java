package com.yaolong.design.mode.mediator;

/**
 * @program: DesignMode
 * @description: 同事抽象类
 * @author: yaolong
 * @create: 2020-03-15 22:23
 **/
public abstract class Colleague {

    private Mediator mediator;

    public Colleague( Mediator mediator) {
        this.mediator= mediator;
    }

    public Mediator getMediator() {
        return this.mediator;
    }
}
