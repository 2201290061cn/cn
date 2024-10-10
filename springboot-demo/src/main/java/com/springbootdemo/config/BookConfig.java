package com.springbootdemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookConfig {

    private String name;

    private String author;

}
