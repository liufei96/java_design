package com.yiyang.java.adapter;

/**
 * @author Liufei
 * @date 2020/5/14 11:28 下午
 */
public class JP110VInterfaceImpl implements JP110VInterface {

    @Override
    public void connection() {
        System.out.println("日本110V,接通电源,开始工作...");
    }
}
