package com.expmle.mybaits.test;

import com.expmle.mybatis.mappers.UserMapper;
import com.expmle.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {
    @Test
    public void insertTest() throws Exception{
        SqlSessionUtils sqlSessionUtils = null;
        SqlSession sqlSession = sqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser();


    }
}
