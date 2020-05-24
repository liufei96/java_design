package com.yiyang.java.single;

import java.io.*;

/**
 * @author Liufei
 * @date 2020/4/25 5:33 下午
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton () {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


    }
}
