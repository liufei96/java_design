package com.yiyang.java.single;

import java.io.*;

/**
 * @author Liufei
 * @date 2020/4/25 10:19 下午
 */
public class LazySingle implements Serializable {

    private static LazySingle instance;

    private LazySingle() {

    }

    public static synchronized LazySingle getInstance() {
        if (instance != null) {
            instance = new LazySingle();
        }
        return instance;
    }

}
