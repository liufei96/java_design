package com.yiyang.java.adapter;

/**
 * @author Liufei
 * @date 2020/5/14 11:29 下午
 */
public class ElectricCooker {

    private JP110VInterface jp110VInterface;

    public ElectricCooker(JP110VInterface jp110VInterface) {
        this.jp110VInterface = jp110VInterface;
    }

    public void cook() {
        jp110VInterface.connection();
        System.out.println("开始做饭了...");
    }
}
