package com.yiyang.java.factory.abstractFactory;

import com.yiyang.java.factory.simpleFactory.Sender;

/**
 * @author Liufei
 * @date 2020/4/10 2:20 下午
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Provider mailFactory = new MailFactory();
        Sender product = mailFactory.product();
        product.send();
    }
}
