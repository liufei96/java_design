package com.yiyang.java.factory.moreFactory;

import com.yiyang.java.factory.simpleFactory.Sender;

/**
 * @author Liufei
 * @date 2020/4/10 2:08 下午
 */
public class MoreFactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Sender sender = factory.productMail();
        sender.send();
    }
}
