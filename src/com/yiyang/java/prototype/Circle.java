package com.yiyang.java.prototype;

/**
 * @author Liufei
 * @date 2020/4/10 2:51 下午
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
