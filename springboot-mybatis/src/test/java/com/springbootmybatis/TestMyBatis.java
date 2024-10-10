package com.springbootmybatis;

import com.springbootmybatis.entity.UserMyBatis;
import com.springbootmybatis.mapper.UserMyBatisMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class TestMyBatis {


    @Resource
    private UserMyBatisMapper userMyBatisMapper;

    @Test
    public void test1(){
        userMyBatisMapper.insert("aaa", 20);
    }


}
