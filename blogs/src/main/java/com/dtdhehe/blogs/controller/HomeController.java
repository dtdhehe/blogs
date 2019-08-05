package com.dtdhehe.blogs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/7/30 17:14
 * @description
 **/
@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
