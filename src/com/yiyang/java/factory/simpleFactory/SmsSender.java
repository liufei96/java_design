package com.yiyang.java.factory.simpleFactory;

/**
 * @author Liufei
 * @date 2020/4/10 12:03 下午
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailSender");
    }
}
