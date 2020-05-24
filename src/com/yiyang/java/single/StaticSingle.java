package com.yiyang.java.single;

/**
 * @author Liufei
 * @date 2020/4/25 10:22 下午
 */
public class StaticSingle {

    private StaticSingle() {

    }

    private static class SingletonClassInstance {
        private static final StaticSingle instance = new StaticSingle();
    }

    public static StaticSingle getInstance() {
        return SingletonClassInstance.instance;
    }

    public static void main(String[] args) {
        for (int i =0; i < 20; i++) {
            new Thread(() -> {
                StaticSingle instance = StaticSingle.getInstance();
                System.out.println(Thread.currentThread().getName() + ": " + instance);
            }, String.valueOf(i)).start();
        }
    }
}
