package com.kuang.utils;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisUtils {
    @Test
    public void test() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession sqlSession = sessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();


    }






}
