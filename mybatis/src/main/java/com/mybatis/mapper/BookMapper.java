package com.mybatis.mapper;

import com.mybatis.entity.Book;

import java.util.List;

public interface BookMapper {

    List<Book> selectByName(String name);
}
