package com.springcore;

import com.springcore.aop.target.Perfomer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class AOPTest {

    @Resource
    private Perfomer perfomer;

    @Test
    public void test(){
        perfomer.perform();
    }
}
