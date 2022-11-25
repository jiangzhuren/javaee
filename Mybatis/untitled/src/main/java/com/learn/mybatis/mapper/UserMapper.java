package com.learn.mybatis.mapper;

import com.learn.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertTest();
    List<User> selectUser();
}
