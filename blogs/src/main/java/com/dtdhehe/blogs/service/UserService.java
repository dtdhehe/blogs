package com.dtdhehe.blogs.service;

import com.dtdhehe.blogs.entity.User;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/1 21:48
 * @description
 **/
public interface UserService {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User findByUserName(String userName);
}
