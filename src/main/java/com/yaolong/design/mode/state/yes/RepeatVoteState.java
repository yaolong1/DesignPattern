package com.yaolong.design.mode.state.yes;

/**
 * @program: DesignMode
 * @description: 重复投票状态
 * @author: yaolong
 * @create: 2020-03-25 11:09
 **/
public class RepeatVoteState implements VoteState{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}
