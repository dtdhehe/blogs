package com.dtdhehe.blogs.service.impl;

import com.dtdhehe.blogs.entity.User;
import com.dtdhehe.blogs.mapper.UserMapper;
import com.dtdhehe.blogs.service.UserService;
import com.dtdhehe.blogs.util.ConstantUtils;
import com.dtdhehe.blogs.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    @Override
    public Integer saveOrUpdateUser(User user) {
        if (StringUtils.isEmpty(user.getId())){
            //id为空，新增用户
            user.setId(UserUtils.getUniqueKey());
            //取用户名作为加密盐
            user.setPassword(UserUtils.getPWD(user.getPassword(),user.getUserName()));
            user.setValid(ConstantUtils.NOTACTIVE);
            return userMapper.save(user);
        }else {
            //TODO 修改用户
            return null;
        }
    }
}
