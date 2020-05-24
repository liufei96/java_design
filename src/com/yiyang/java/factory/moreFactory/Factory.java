package com.yiyang.java.factory.moreFactory;

import com.yiyang.java.factory.simpleFactory.MailSender;
import com.yiyang.java.factory.simpleFactory.Sender;
import com.yiyang.java.factory.simpleFactory.SmsSender;

/**
 * 多工厂模式
 * @author Liufei
 * @date 2020/4/10 2:06 下午
 */
public class Factory {

    public Sender productMail() {
        return new MailSender();
    }

    public Sender productSms() {
        return new SmsSender();
    }
}
