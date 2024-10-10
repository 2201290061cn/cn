package com.springbootmybatis.mapper;

import com.springbootmybatis.entity.Passenger;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface PassengerMapper {
   // @Select("SELECT * FROM t_passengers WHERE id = #{id}")
    @Select("select * from t_passengers where id = #{id}")
    Passenger selectPassengerById(Integer id);


}