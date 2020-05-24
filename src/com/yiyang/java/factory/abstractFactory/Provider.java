package com.yiyang.java.factory.abstractFactory;

import com.yiyang.java.factory.simpleFactory.Sender;

/**
 * @author Liufei
 * @date 2020/4/10 2:18 下午
 */
public interface Provider {
    Sender product();
}
