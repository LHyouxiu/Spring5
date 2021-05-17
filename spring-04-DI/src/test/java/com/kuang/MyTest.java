package com.kuang;

import com.kuang.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student =(Student) context.getBean("Student");

        System.out.println(student.getName());
        System.out.println(student.getAddress().getAddress());
        System.out.println(student.getBooks().length);
        System.out.println(student.getHobbys());
        System.out.println(student.getCard());
        System.out.println(student.getGames());
        System.out.println(student.getInfo());
        System.out.println(student.getWife());

    }

}
