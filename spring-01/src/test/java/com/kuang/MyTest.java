package com.kuang;

import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.getUser();

//        set方式
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
    @Test
    public void testMysql(){
        UserDaoMysqlImpl userDaoMysql = new UserDaoMysqlImpl();
        userDaoMysql.getUser();
    }

}
