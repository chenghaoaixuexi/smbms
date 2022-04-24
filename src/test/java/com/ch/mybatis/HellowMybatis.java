package com.ch.mybatis;

import com.ch.mapper.UserMapper;
import com.ch.pojo.User;
import com.ch.utils.SqlSeesionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月20日 09:39
 */
public class HellowMybatis {
    @Test
    public void testHellowmybatis(){
        SqlSession sqlSeesion = SqlSeesionUtils.getSqlSeesion();
        UserMapper mapper = sqlSeesion.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
    }

    @Test
    public void testQueryUsername(){
        SqlSession sqlSession = SqlSeesionUtils.getSqlSeesion();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUsernameById(1);
        System.out.println(user);
    }
}
