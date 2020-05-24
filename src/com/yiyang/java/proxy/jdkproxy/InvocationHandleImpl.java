package com.yiyang.java.proxy.jdkproxy;

import com.yiyang.java.proxy.staticProxy.UserDao;
import com.yiyang.java.proxy.staticProxy.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Liufei
 * @date 2020/5/8 10:35 下午
 */
public class InvocationHandleImpl implements InvocationHandler {

    // 目标代理对象
    private Object target;

    public InvocationHandleImpl(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开启事务——————");
        Object invoke = method.invoke(target, args);
        System.out.println("动态提交开启事务——————");
        return invoke;
    }


    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        InvocationHandleImpl invocationHandle = new InvocationHandleImpl(userDao);
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, invocationHandle);
        userDao1.add();
    }
}
