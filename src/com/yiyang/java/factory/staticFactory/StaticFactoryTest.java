package com.yiyang.java.factory.staticFactory;

import com.yiyang.java.factory.simpleFactory.Sender;

/**
 * 静态工程测试
 * @author Liufei
 * @date 2020/4/10 2:12 下午
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        Sender sender = StaticFactory.productMail();
        sender.send();
    }
}
