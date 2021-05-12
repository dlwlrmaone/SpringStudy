package com.dlwlrma.spring5.testDemo;

import com.dlwlrma.spring5.Book;
import com.dlwlrma.spring5.Orders;
import com.dlwlrma.spring5.User;
import com.dlwlrma.spring5.bean.Emp;
import com.dlwlrma.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean2(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testBean3(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }

    @Test
    public void testBean4(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }
}
