package com.yiyang.java.single;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Liufei
 * @date 2020/4/25 5:34 下午
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // 序列化
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(DoubleCheckSingleton.getInstance());
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        DoubleCheckSingleton o = (DoubleCheckSingleton)ois.readObject();
        System.out.println(instance == o);
    }
}
