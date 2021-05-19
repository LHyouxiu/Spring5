package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class User {
//    @Autowired是按类型自动转配的，不支持id匹配。
//    需要导入 spring-aop的包！
//    @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
//    @Qualifier不能单独使用。

//    @Autowired
//    @Qualifier(value = "cat11")
//    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog22")
//    private Dog dog;

//    @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
//其次再进行默认的byName方式进行装配；
    @Resource(name = "cat11")
    private Cat cat;
    @Resource(name = "dog22")
    private Dog dog;
    private String str;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "User{" +
                "str='" + str + '\'' +
                '}';
    }
}
