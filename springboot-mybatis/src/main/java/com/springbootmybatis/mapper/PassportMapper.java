package com.springbootmybatis.mapper;

import com.springbootmybatis.entity.Passenger;
import com.springbootmybatis.entity.Passport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PassportMapper {

   Passport selectById(long id);


}