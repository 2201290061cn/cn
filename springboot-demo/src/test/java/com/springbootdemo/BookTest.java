package com.springbootdemo;

import com.springbootdemo.config.Book;
import com.springbootdemo.config.BookConfig;
import com.springbootdemo.config.Enviroments;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class BookTest {

    @Resource
    private Book book;

    @Resource
    private BookConfig bookConfig;

    @Resource
    private Enviroments enviroments;

    @Test
    public void test1(){
        log.info("book = {}", book);
    }

    @Test
    public void test2(){
        log.info("bookConfig = {}", bookConfig);
    }

    @Test
    public void test3(){
        log.info("enviroments = {}", enviroments);
    }
}
