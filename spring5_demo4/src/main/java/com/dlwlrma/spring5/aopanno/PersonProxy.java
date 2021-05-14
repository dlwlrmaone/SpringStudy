package com.dlwlrma.spring5.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    //后置通知（返回通知）：有异常发生时，不执行
    @AfterReturning(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("person afterReturning...");
    }
}
