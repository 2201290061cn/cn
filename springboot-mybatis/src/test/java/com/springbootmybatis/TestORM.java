package com.springbootmybatis;

import com.springbootmybatis.entity.Manager;
import com.springbootmybatis.mapper.ManagerMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*
  @author:cn
  @date:2024/10/10 9:34
*/
@SpringBootTest
@Slf4j
public class TestORM {
    @Resource
    private ManagerMapper managerMapper;
    @Test
    public void test() {
        Manager manager = managerMapper.selectManagerById(1001);
        log.info("manager:{}",manager);
    }
}
