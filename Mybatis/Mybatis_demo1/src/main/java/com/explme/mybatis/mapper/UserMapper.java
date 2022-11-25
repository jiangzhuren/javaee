package com.explme.mybatis.mapper;

import com.explme.mybatis.pojo.User;

import java.util.List;

//调用接口中的方法，接口调用sql语句执行
public interface UserMapper {
    /**
     *
     * 添加用户信息
     * @return
     */
    int insertUser();

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();



}
