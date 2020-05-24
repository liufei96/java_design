package com.yiyang.java.proxy.staticProxy;

/**
 * @author Liufei
 * @date 2020/5/7 11:22 下午
 */
public class ProxyTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.add();
    }
}
