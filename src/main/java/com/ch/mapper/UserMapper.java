package com.ch.mapper;

import com.ch.pojo.User;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月19日 23:43
 */
public interface UserMapper {
    /*
     * @Description:根据主键查询User信息
     */
    User queryUserById(Integer id);


     /*
     查询User表里的UserName
      */

    User queryUsernameById(Integer id);

    /*
    根据用户名查询员工
        命名还不规范
     */

    User queryUserByUserName(String userName);
}
