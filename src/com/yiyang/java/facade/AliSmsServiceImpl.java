package com.yiyang.java.facade;

/**
 * @author Liufei
 * @date 2020/5/14 11:47 下午
 */
public class AliSmsServiceImpl implements SmsService {
    @Override
    public void sendSms() {
        System.out.println("阿里发送消息通知");
    }
}
