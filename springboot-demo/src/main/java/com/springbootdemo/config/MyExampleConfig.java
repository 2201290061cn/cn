package com.springbootdemo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "spring.my-example")
public class MyExampleConfig {

    private List<String> url;

    private Map<String,String> auth;

}
