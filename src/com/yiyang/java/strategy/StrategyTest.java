package com.yiyang.java.strategy;

/**
 * @author Liufei
 * @date 2020/5/23 6:10 下午
 */
public class StrategyTest {

    public static void main(String[] args) {
        MemberContext context = new MemberContext(new PrimaryMember());
        context.memberStrategy();

        context = new MemberContext(new MiddleMember());
        context.memberStrategy();

        context = new MemberContext(new HighMember());
        context.memberStrategy();
    }
}
