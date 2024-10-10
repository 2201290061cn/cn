package com.springbootmybatis.mapper;

import com.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
		
     User selectUserByIdAndPwd(Integer id , String pwd);

     User selectUserByIdAndPwd4(Map values);

    //使用对象属性进行参数绑定
    User selectUserByUserInfo(User user);

    List<User> selectUsersByKeyword(String keyword);

    void deleteUser(Integer id);

    void updateUser(User user);

    void insertUser(User user);
   }