package com.yiyang.java.proxy.staticProxy;

import javax.annotation.Resource;

/**
 * 静态代理需要生成代理对象，一个代理类只能代理一个类，当有很多的时候，需要创建多个代理类
 * @author Liufei
 * @date 2020/5/7 11:20 下午
 */
public class UserDaoProxy implements UserDao {

    @Resource
    private UserDao userDao;

    public UserDaoProxy (UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public Integer add() {
        System.out.println("开启事务--");
        userDao.add();
        System.out.println("提交事务--");
        return null;
    }

    @Override
    public Integer update() {
        System.out.println("开启事务--");
        userDao.update();
        System.out.println("提交事务--");
        return null;
    }
}
