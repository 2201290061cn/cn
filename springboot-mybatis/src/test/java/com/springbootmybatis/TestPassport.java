package com.springbootmybatis;

import com.springbootmybatis.entity.Passenger;
import com.springbootmybatis.entity.Passport;
import com.springbootmybatis.mapper.PassengerMapper;
import com.springbootmybatis.mapper.PassportMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*
  @author:cn
  @date:2024/10/10 10:59
*/
@SpringBootTest
@Slf4j
public class TestPassport {
    @Resource
    private PassportMapper passportMapper;;


    @Test
    public void test2(){
        Passport passport = passportMapper.selectById(1000001L);
        log.info("passport:{}",passport);
    }
}
