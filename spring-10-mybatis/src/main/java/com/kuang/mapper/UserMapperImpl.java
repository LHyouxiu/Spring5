package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;

public class UserMapperImpl implements UserMapper{
//    在之前我们所有的操作的都是用sqlSession来操作，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
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
