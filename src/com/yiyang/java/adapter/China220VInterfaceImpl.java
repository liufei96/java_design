package com.yiyang.java.adapter;

/**
 * @author Liufei
 * @date 2020/5/14 11:28 下午
 */
public class China220VInterfaceImpl implements China220VInterface{

    @Override
    public void connection() {
        System.out.println("中国220V,接通电源,开始工作...");
    }
}
