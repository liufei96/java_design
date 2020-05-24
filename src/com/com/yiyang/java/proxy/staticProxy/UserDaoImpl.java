package com.yiyang.java.proxy.staticProxy;

/**
 * @author Liufei
 * @date 2020/5/7 11:20 下午
 */
public class UserDaoImpl implements com.yiyang.java.proxy.staticProxy.UserDao {


    @Override
    public Integer add() {
        System.out.println("添加用户操作");
        return null;
    }

    @Override
    public Integer update() {
        System.out.println("更新用户操作");
        return null;
    }
}
