package com.yiyang.java.template;

/**
 * @author Liufei
 * @date 2020/5/14 11:07 下午
 */
public class ClientTest {

    public static void main(String[] args) {
        BankTemplateMethod saveMoney = new SaveMoney();
        saveMoney.process();
    }
}
