package com.dtdhehe.blogs.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/1 21:13
 * @description
 **/
@Data
public class User {

    private String id;

    private String userName;

    private String password;

    private String gender;

    private String nickName;

    private String phone;

    private String qqNum;

    private String wechatNum;

    private String motto;

    private String email;

    private String valid;

    private List<Role> roleList;

}
