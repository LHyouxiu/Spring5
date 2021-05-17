package com.kuang;

import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //在执行getBean的时候，user已经创建好了，通过无参构造
//        User user = (User) context.getBean("user");

//        alias别名
//        User user = (User) context.getBean("userAlias");

//        name 起多个别名 逗号 空格 分号
//        User user = (User) context.getBean("hello2");
//        User user = (User) context.getBean("h2");
        User user = (User) context.getBean("h3");

        //调用对象的方法
        user.show();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT) context.getBean("userT");
        userT.show();


    }
}
