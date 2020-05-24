package com.yiyang.java.template;

/**
 * @author Liufei
 * @date 2020/5/14 11:02 下午
 */
public abstract class BankTemplateMethod {


    public void takeNum() {
        System.out.println("取号排队...");
    }

    /**
     * 办理业务
     */
    public abstract void transact();


    public void evaluate() {
        System.out.println("反馈评价..");
    }

    public void process() {
        takeNum();
        transact();
        evaluate();
    }
}
