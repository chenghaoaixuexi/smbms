package com.ch.service;

import com.ch.mapper.UserMapper;
import com.ch.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月24日 20:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User doLogin(String userName, String userPassword) {
        User user = userMapper.queryUserByUserName(userName);

        if (user != null){
            if (user.getUserPassword().equals(userPassword) ){
                return null;
            }
        }
        return user;
    }
}
