package com.springbootmybatis;

import com.springbootmybatis.entity.Passenger;
import com.springbootmybatis.mapper.PassengerMapper;
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
public class TestPassenger {
    @Resource
    private PassengerMapper passengerMapper;


    @Test
    public void test() {
        Passenger passenger = passengerMapper.selectPassengerById(1001);
        log.info("passenger:{}", passenger);
    }
}
