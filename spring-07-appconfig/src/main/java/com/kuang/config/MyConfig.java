package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//代表这是一个配置类 也会被spring托管，注册到容器中，它本身也是一个@component
@Configuration
@ComponentScan("com.kuang.pojo")
//导入合并其他配置类，类似于配置文件中的 inculde 标签
@Import(MyConfig2.class)
public class MyConfig {

    //通过方法注册一个bean，这里的返回值就Bean的类型，方法名就是bean的id！
    @Bean
    public User user(){
        return new User();
    }

}
