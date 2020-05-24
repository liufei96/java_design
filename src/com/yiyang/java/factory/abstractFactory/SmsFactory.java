package com.yiyang.java.factory.abstractFactory;

import com.yiyang.java.factory.simpleFactory.Sender;
import com.yiyang.java.factory.simpleFactory.SmsSender;

/**
 * @author Liufei
 * @date 2020/4/10 2:20 下午
 */
public class SmsFactory implements Provider {

    @Override
    public Sender product() {
        return new SmsSender();
    }
}
