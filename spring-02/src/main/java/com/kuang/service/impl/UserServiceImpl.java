package com.kuang.service.impl;

import com.kuang.dao.UserDao;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoImpl();


//    set方式
    private UserDao userDao;
    //set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
