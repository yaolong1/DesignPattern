package com.yaolong.design.mode.state.yes;

/**
 * @program: DesignMode
 * @description:
 * @author: yaolong
 * @create: 2020-03-22 15:32
 **/
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++){
            vm.vote("u1", "A");
        }
    }
}
