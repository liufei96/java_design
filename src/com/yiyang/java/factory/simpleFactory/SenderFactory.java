package com.yiyang.java.factory.simpleFactory;

/**
 * @author Liufei
 * @date 2020/4/10 12:03 下午
 */
public class SenderFactory {

    public Sender product(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
