package com.yiyang.java.factory.abstractFactory;

import com.yiyang.java.factory.simpleFactory.MailSender;
import com.yiyang.java.factory.simpleFactory.Sender;

/**
 * @author Liufei
 * @date 2020/4/10 2:19 下午
 */
public class MailFactory implements Provider {

    @Override
    public Sender product() {
        return new MailSender();
    }
}
