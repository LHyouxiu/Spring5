package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    int addUser(User user);

    int deleteUser(int id);
}
