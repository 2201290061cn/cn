package com.springbootdemo;

import com.springbootdemo.config.RandomConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class RandomTest {

    @Resource
    private RandomConfig randomConfig;

    @Test
    public void test() {
        log.info("random is {}",randomConfig);
    }
}
