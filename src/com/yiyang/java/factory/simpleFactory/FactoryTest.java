package com.yiyang.java.factory.simpleFactory;

/**
 * @author Liufei
 * @date 2020/4/10 2:01 下午
 */
public class FactoryTest {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender mail = senderFactory.product("mail");
        mail.send();
    }
}
