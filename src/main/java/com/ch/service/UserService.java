package com.ch.service;

import com.ch.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    //处理用户登录业务
    public User doLogin(String userName, String userPassword);
}
