package com.yiyang.java.builder;

import com.yiyang.java.factory.simpleFactory.Sender;

import java.util.List;

/**
 * @author Liufei
 * @date 2020/4/10 2:31 下午
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.productMailSender(10);
        List<Sender> senderList = builder.getSenderList();
        for (Sender sender: senderList) {
            sender.send();
        }
    }
}


