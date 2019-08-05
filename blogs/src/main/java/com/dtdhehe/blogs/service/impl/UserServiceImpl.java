package com.dtdhehe.blogs.service.impl;

import com.dtdhehe.blogs.entity.User;
import com.dtdhehe.blogs.mapper.UserMapper;
import com.dtdhehe.blogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/1 21:49
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
