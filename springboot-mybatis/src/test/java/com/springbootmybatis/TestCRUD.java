package com.springbootmybatis;


import com.springbootmybatis.entity.User;

import com.springbootmybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
public class TestCRUD {

    @Resource
    private UserMapper userMapper;


    @Test
    public void test1(){
        User user = userMapper.selectUserByIdAndPwd(1, "123");
        log.info("user:{}",user);
    }

    @Test
    public void test2(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("pwd","123");
        User user = userMapper.selectUserByIdAndPwd4(map);
        log.info("user:{}",user);
    }

    @Test
    public void test3(){
        User condition = new User();
        condition.setId(1);
        condition.setPassword("123");
        User user = userMapper.selectUserByUserInfo(condition);
        log.info("user:{}",user);
    }

    @Test
    public void test4(){
        List<User> list = userMapper.selectUsersByKeyword("a");
        log.info("list:{}",list);
    }

    @Test
    public void test5(){
        userMapper.deleteUser(4);
    }

    @Test
    public void test6(){
        User user = new User(3,"www","321","妖",new Date(),new Date());
        userMapper.updateUser(user);
    }

    @Test
    public void test7(){
        User user = new User(null,"qqq","666","妖",new Date(),new Date());
        userMapper.insertUser(user);

    }


}
