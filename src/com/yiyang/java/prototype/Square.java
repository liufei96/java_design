package com.yiyang.java.prototype;

/**
 * @author Liufei
 * @date 2020/4/10 2:50 下午
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
