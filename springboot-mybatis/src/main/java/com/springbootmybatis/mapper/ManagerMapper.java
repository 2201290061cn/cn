package com.springbootmybatis.mapper;

import com.springbootmybatis.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface ManagerMapper {
    Manager selectManagerById(Integer id);
    //set不能重复，所以这里用set，无序，取出用来遍历

    Set<Manager> selectAllManagers();
}