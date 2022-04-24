package com.ch.controller;

import com.ch.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenghao
 * @purpose：关于用户的控制层
 * @备注：
 * @data 2022年04月24日 19:46
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    //项目登录页面
    @RequestMapping("/")
    public String tologin(){
        return "login";
    }

    @RequestMapping("dologin")
    public String dologin(String userName,String userPassword){

    }


}
