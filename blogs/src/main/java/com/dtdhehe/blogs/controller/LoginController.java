package com.dtdhehe.blogs.controller;

import com.dtdhehe.blogs.entity.User;
import com.dtdhehe.blogs.util.ResultUtils;
import com.dtdhehe.blogs.vo.ResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/7/30 16:59
 * @description
 **/
@RestController
public class LoginController {

    @RequestMapping("/hello")
    public String testHello(){
        return "hello blogs";
    }

    @RequestMapping("/unLogin")
    public String unLogin(){
        return "unLogin";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultVO login(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try {
            subject.login(token);
            return ResultUtils.success("login");
        }catch (UnknownAccountException e){
            e.printStackTrace();
            return ResultUtils.failed("用户名不存在");
        }catch (DisabledAccountException e){
            e.printStackTrace();
            return ResultUtils.failed("该用户未激活");
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            return ResultUtils.failed("密码错误");
        }
    }

}
