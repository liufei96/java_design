package com.yiyang.java.builder;

/**
 * @author Liufei
 * @date 2020/5/13 10:09 下午
 */
public class AmericaPerson implements PersonBuilder {
    private Person person;

    public AmericaPerson() {
        // 创建一个Person实例,用于调用set方法
        person = new Person();
    }

    @Override
    public void builderHead() {
        person.setHead("建造者头部分");
    }

    @Override
    public void builderBody() {
        person.setBody("建造者身体部分");
    }

    @Override
    public void builderFoot() {
        person.setFoot("建造者头四肢部分");
    }

    @Override
    public Person builderPerson() {
        return person;
    }
}
