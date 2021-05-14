package com.dlwlrma.spring5.service;

import com.dlwlrma.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//效果和<bean id="userService" class="..."></bean>一样
//注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
@Service
public class UserService {

    @Autowired
//    @Qualifier(value = "userDaoImpl1")
    //不需要添加set方法
//    @Resource //根据类型进行注入
//    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "zhangsan")
    private String name;

    public void add(){
        System.out.println("service add ......");
        System.out.println(name);
        userDao.add();
    }
}
