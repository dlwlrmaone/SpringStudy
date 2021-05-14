package com.dlwlrma.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

        //增强方法所在的类实现的接口
        Class[] interfaces = {UserDao.class};

        //被代理对象
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userDao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int add = userDao.add(1, 2);
        System.out.println("结果为：" + add);

    }
}

//实现这个接口InvocationHandler，创建代理对象
class UserDaoProxy implements InvocationHandler{

    //把被代理对象传递进来
    //有参构造传递
    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    //增强逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法前
        System.out.println("方法之前执行..." + method.getName() + "，传递的参数" + Arrays.toString(args));
        //执行增强方法
        Object invoke = method.invoke(object, args);
        //方法后
        System.out.println("方法之后执行..." + object);
        return invoke;
    }
}