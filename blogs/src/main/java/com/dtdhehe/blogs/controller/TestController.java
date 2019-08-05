package com.dtdhehe.blogs.controller;

import com.dtdhehe.blogs.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/7/30 16:59
 * @description
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String testHello(){
        return "hello blogs";
    }

    @RequestMapping("/unLogin")
    public String unLogin(){
        return "unLogin";
    }

    @RequestMapping("/login")
    public String login(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            subject.login(token);
            return "login";
        }catch (UnknownAccountException e){
            e.printStackTrace();
            return "用户名不存在";
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            return "密码错误";
        }
    }

}
