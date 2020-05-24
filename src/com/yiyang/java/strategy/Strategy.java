package com.yiyang.java.strategy;

/**
 * @author Liufei
 * @date 2020/5/23 6:04 下午
 */
public abstract class Strategy {

    abstract void memberStrategy();
}


class PrimaryMember extends Strategy {

    @Override
    void memberStrategy() {
        System.out.println("初级会员的计算方式");
    }
}

class MiddleMember extends Strategy {

    @Override
    void memberStrategy() {
        System.out.println("中级会员的计算方式");
    }
}

class HighMember extends Strategy {

    @Override
    void memberStrategy() {
        System.out.println("高级会员的计算方式");
    }
}