package com.yiyang.java.facade;

/**
 * @author Liufei
 * @date 2020/5/14 11:46 下午
 */
public class WeiXinSmsServiceImpl implements SmsService {
    @Override
    public void sendSms() {
        System.out.println("微信发送消息...");
    }
}
