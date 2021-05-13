package com.dlwlrma.spring5.testDemo2;

import com.dlwlrma.spring5.autowire.Emp;
import com.dlwlrma.spring5.bean.Orders;
import com.dlwlrma.spring5.collectiontype.Book;
import com.dlwlrma.spring5.collectiontype.Course;
import com.dlwlrma.spring5.collectiontype.Stu;
import com.dlwlrma.spring5.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testCollection(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
        stu.out();
    }

    @Test
    public void testCollection2(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book1 == book2);
        book1.out();
    }

    @Test
    public void testCollection3(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }

    @Test
    public void testBean(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步：获取bean对象");
        System.out.println(orders);

        //手动销毁bean实例对象
        context.close();
    }

    @Test
    public void testBean2(){

        //1.加载Spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }

}
