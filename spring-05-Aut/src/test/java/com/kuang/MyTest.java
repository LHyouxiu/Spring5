package com.kuang;

import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        User user = context.getBean("user",User.class);
//        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
    }
}
