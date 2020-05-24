package com.yiyang.java.adapter;

/**
 * @author Liufei
 * @date 2020/5/14 11:35 下午
 */
public class AdaptorTest {

    public static void main(String[] args) {
        China220VInterface china220VInterface = new China220VInterfaceImpl();
        PowerAdaptor powerAdaptor = new PowerAdaptor(china220VInterface);
        ElectricCooker electricCooker = new ElectricCooker(powerAdaptor);
        electricCooker.cook();
    }
}
