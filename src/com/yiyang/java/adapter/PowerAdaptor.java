package com.yiyang.java.adapter;

/**
 * @author Liufei
 * @date 2020/5/14 11:34 下午
 */
public class PowerAdaptor implements JP110VInterface {

    private China220VInterface china220VInterface;

    public PowerAdaptor (China220VInterface china220VInterface) {
        this.china220VInterface = china220VInterface;
    }

    @Override
    public void connection() {
        china220VInterface.connection();
    }
}
