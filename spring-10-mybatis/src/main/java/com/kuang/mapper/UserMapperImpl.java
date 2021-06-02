package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl implements UserMapper{
//    在之前我们所有的操作的都是用sqlSession来操作，现在使用sqlSessionTemplate
    private sqlSessionTemplate sqlSession;

    public void setSqlSession(sqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
//        sqlSession
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}

//public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
//    //添加一些操作
//    @Override
//    public List<User> selectUser() {
//        User user = new User(4,"明","123456");
//        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
//        userMapper.addUser(user);
//        userMapper.deleteUser(4);
//
//        return userMapper.selectUser();
//    }
//
//    //新增
//    @Override
//    public int addUser(User user) {
//        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
//
//        return userMapper.addUser(user);
//    }
//
//    @Override
//    public int deleteUser(int id) {
//        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
//
//        return userMapper.deleteUser(id);
//    }
//}
