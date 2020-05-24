package com.yiyang.java.facade;

/**
 * @author Liufei
 * @date 2020/5/14 11:48 下午
 */
public class ComputerFacade {

    SmsService aliSmsService;
    SmsService emailSmsService;
    SmsService weiXinSmsService;

    public ComputerFacade() {
        aliSmsService = new AliSmsServiceImpl();
        emailSmsService = new EmailSmsServiceImpl();
        weiXinSmsService = new WeiXinSmsServiceImpl();
    }

    public void sendMsg() {
        aliSmsService.sendSms();
        emailSmsService.sendSms();
        weiXinSmsService.sendSms();
    }
}
