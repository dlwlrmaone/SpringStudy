package com.dlwlrma.spring5.service;

import com.dlwlrma.spring5.dao.UserDao;
import com.dlwlrma.spring5.dao.daoImpl.UserDaoImpl;

public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("userService add ......");

        //原始方式：创建userDao对象
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();

        userDao.update();
    }
}
