package com.mybatis;

import com.mybatis.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis {

    public static void main(String[] args) throws IOException {
        //1.获得读取MyBatis配置文件的流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        //2.构建SqlSession连接对象的工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        //3.通过工厂获得连接对象
        SqlSession sqlSession = factory.openSession();

//        //4.通过连接对象获得接口实现类对象
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//
//        //5.调用接口中的方法
//        System.out.println(userMapper.selectByPrimaryKey(1));

        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        System.out.println(bookMapper.selectByName("三国演义"));
    }
}
