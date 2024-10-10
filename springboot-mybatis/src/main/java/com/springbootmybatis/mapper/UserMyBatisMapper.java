package com.springbootmybatis.mapper;

import  com.springbootmybatis.entity.UserMyBatis;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMyBatisMapper {



    @Insert("INSERT INTO USERMYBATIS(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}