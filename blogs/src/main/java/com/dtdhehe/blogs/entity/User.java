package com.dtdhehe.blogs.entity;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/1 21:13
 * @description
 **/
public class User {

    private Integer id;

    private String userName;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
