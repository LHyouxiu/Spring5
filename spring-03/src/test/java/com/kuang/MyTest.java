package com.kuang;

import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //在执行getBean的时候，user已经创建好了，通过无参构造
        User user = (User) context.getBean("user");
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
