package com.springcore.aop.target;

import org.springframework.stereotype.Component;

//演员 核心业务
@Component
public class Perfomer {

    public void perform(){
        System.out.println("演员表演");
    }
}
