package com.yiyang.java.builder;

import com.yiyang.java.factory.simpleFactory.MailSender;
import com.yiyang.java.factory.simpleFactory.Sender;
import com.yiyang.java.factory.simpleFactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author Liufei
 * @date 2020/4/10 2:28 下午
 */
public class Builder {

    private List<Sender>  senderList = new ArrayList<>();

    public void productMailSender(int count) {
        for(int i=0; i<count; i++){
            senderList.add(new MailSender());
        }
    }

    public void productSmsSender(int count) {
        for(int i=0; i<count; i++){
            senderList.add(new SmsSender());
        }
    }

    public List<Sender> getSenderList() {
        return senderList;
    }
}
