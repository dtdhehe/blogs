package com.dtdhehe.blogs.service.impl;

import com.dtdhehe.blogs.entity.User;
import com.dtdhehe.blogs.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/1 21:49
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByUserName(String userName) {
        //测试数据
        User user = new User();
        user.setId(1);
        user.setUserName("dtdhehe");
        user.setPassword("123456");
        if ("dtdhehe".equals(userName)){
            return user;
        }
        return null;
    }
}
