package com.yiyang.java.strategy;

/**
 * @author Liufei
 * @date 2020/5/23 6:09 下午
 */
public class MemberContext {

    private Strategy strategy;

    public MemberContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void memberStrategy() {
        strategy.memberStrategy();
    }
}
