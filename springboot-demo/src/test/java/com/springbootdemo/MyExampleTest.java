package com.springbootdemo;

import com.springbootdemo.config.MyExampleConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class MyExampleTest {

    @Resource
    private MyExampleConfig myExampleConfig;

    @Test
    public void test() {
        log.info("myExampleConfig = {}", myExampleConfig);
    }
}
