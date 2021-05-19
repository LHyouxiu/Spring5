package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {

//    private String name = "狂神";
// 相当于配置文件中 <property name="name" value="秦疆"/>
    @Value("狂神")
    private  String name;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
