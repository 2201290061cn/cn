package com.springbootmybatis.mapper;

import com.springbootmybatis.entity.Passport;
import com.springbootmybatis.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {


    //根据ID来查某一本护照
    Passport selectById(Long id);
}