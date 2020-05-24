package com.yiyang.java.builder;

/**
 * @author Liufei
 * @date 2020/5/13 10:05 下午
 */
public interface PersonBuilder {

    void builderHead();

    void builderBody();

    void builderFoot();

    Person builderPerson(); //组装
}
