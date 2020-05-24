package com.yiyang.java.single;

/**
 * @author Liufei
 * @date 2020/4/25 10:16 下午
 */
public class HungrySingleton2 {

    private static HungrySingleton2 instance = null;

    static {
        instance = new HungrySingleton2();
    }

    private HungrySingleton2 () {

    }

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}
