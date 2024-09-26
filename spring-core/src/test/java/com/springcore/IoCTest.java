package com.springcore;

import com.springcore.di.UserService;
import com.springcore.ioc.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j//日志
public class IoCTest {

    @Resource//依赖注入
    private User user;

    @Resource(name = "userServiceImpl2")
    private UserService userService;

    @Test
    public void testUser(){
        log.info("user is {}",user);
    }

    @Test
    public void testUserService(){
        userService.login();
    }

}
