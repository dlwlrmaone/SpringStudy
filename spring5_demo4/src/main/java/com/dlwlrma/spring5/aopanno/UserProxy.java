package com.dlwlrma.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void pointCut(){

    }

    //前置通知
    @Before(value = "pointCut()")
    public void before(){
        System.out.println("before...");
    }

    //最终通知
    @After(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    //后置通知（返回通知）：有异常发生时，不执行
    @AfterReturning(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    //环绕通知
    @Around(value = "execution(* com.dlwlrma.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before...");
        //增强方法
        proceedingJoinPoint.proceed();
        System.out.println("around after...");
    }
}
