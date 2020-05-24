package com.yiyang.java.prototype;

/**
 * @author Liufei
 * @date 2020/4/10 2:49 下午
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
