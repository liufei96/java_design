package com.yiyang.java.facade;

/**
 * @author Liufei
 * @date 2020/5/14 11:44 下午
 */
public class EmailSmsServiceImpl implements SmsService {

    @Override
    public void sendSms() {
        System.out.println("发送邮件消息。。。");
    }

}
