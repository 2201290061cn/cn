package com.springcore.ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//帮你生成setter、getter、final修饰的参数的构造器
//toString()、hashCode()、equals()
@Data
@AllArgsConstructor//所有参数的构造器
@NoArgsConstructor//无参构造器
@Component//组件
public class User {

    @Value("${user.username}")
    private  String name;

    @Value("${user.password}")
    private String password;

    @Value("${user.age}")
    private int age;


}
