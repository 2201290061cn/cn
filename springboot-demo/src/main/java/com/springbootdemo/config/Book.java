package com.springbootdemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration//配置组件
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;
}
