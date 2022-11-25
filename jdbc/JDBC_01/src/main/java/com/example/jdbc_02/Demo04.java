package com.example.jdbc_02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        //反射获取properties文件
        //resources 是项目的同级目录
        InputStream resourceAsStream = Demo04.class.getClassLoader().getResourceAsStream("DB.properties");
        //properties继承了Hashtable类，hashtable类实现了Map接口
        Properties pro = new Properties();
        //通过properties读取key-value结果的数据
        pro.load(resourceAsStream);
        //通过pro对象的key拿值
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        System.out.println(url+username+password);

    }
}
