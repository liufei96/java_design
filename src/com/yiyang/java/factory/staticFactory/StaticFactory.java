package com.yiyang.java.factory.staticFactory;

import com.yiyang.java.factory.simpleFactory.MailSender;
import com.yiyang.java.factory.simpleFactory.Sender;
import com.yiyang.java.factory.simpleFactory.SmsSender;

/**
 * 静态工厂模式
 * @author Liufei
 * @date 2020/4/10 2:11 下午
 */
public class StaticFactory {

    public static Sender productMail() {
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
