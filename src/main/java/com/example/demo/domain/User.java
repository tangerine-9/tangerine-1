package com.example.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor    //自动生成无参构造器
//@AllArgsConstructor	自动生成有参构造器
@Data    //安装上插件后，这个注解可以代表getset，变量显紫色为成功
@ToString    //安装上插件后，这个注解可以代表toString，变量显紫色为成功
@EqualsAndHashCode    //重写hashcode方法
public class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
