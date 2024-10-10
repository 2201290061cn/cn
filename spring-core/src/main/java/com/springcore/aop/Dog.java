package com.springcore.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//观众 非核心业务
@Component//注册到Spring IoC容器中
@Aspect//该类是一个切面
public class Dog {

    //切点
    @Pointcut("execution (* com.springcore.aop.target.*.*(..))")
    public void pc(){

    }

    @Before("pc()")//前置通知
    public void takeSeat(){
        System.out.println("狗狗找座位坐下");
    }

//    @Before("pc()")
    public void turnOffPhone(){
        System.out.println("狗狗关手机");
    }

    @AfterReturning("pc()")//成功返回之后切入
    public void applaud(){
        System.out.println("狗狗鼓掌");
    }

    @AfterThrowing("pc()")//异常退出之后会切入
    public void throwEggs(){
        System.out.println("狗狗扔鸡蛋");
    }
}
