package com.explme.mybatis.mapper.test;

import com.explme.mybatis.mapper.UserMapper;
import com.explme.mybatis.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class mybatistest{
    @Test
    public void test1() throws Exception {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser();
    }
}
