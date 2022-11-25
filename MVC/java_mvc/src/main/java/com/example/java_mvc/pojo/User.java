package com.example.java_mvc.pojo;

import java.io.Serializable;

/**
 *
 *
 * javaBean
 * 1.实现序列化接口
 * 2.属性私有化
 * 3.无参构造方法
 * 4，私有属性getset方法
 * 5.同toString
 *
 */

public class User implements Serializable {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
