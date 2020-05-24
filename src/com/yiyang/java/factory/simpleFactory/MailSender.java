package com.yiyang.java.factory.simpleFactory;

/**
 * @author Liufei
 * @date 2020/4/10 12:02 下午
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailSender");
    }
}
