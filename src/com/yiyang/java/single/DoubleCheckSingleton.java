package com.yiyang.java.single;

/**
 * @author Liufei
 * @date 2020/4/25 10:41 下午
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                  instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
