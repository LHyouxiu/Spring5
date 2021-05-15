package com.kuang;

import com.kuang.pojo.Hello;
import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        //解析beans.xml文件，生成管理相应Bean对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //getBean 参数即为spring配置文件中bean的id
        Hello hello = (Hello)context.getBean("hello");
        hello.show();

    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();

    }
}
