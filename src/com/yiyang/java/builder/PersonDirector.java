package com.yiyang.java.builder;

/**
 * 调用具体建造者来创建复杂对象的各个部分，
 * 在指导者中不涉及具体产品的信息，
 * 只负责保证对象各部分完整创建或按某种顺序创建
 * @author Liufei
 * @date 2020/5/13 10:10 下午
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.builderHead();
        pb.builderBody();
        pb.builderFoot();
        return pb.builderPerson();
    }

    public static void main(String[] args) {
        PersonDirector pb = new PersonDirector();
        Person person = pb.constructPerson(new AmericaPerson());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
