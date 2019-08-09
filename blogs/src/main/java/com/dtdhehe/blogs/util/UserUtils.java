package com.dtdhehe.blogs.util;

import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.UUID;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/7 14:21
 * @description 用户工具类
 **/
public class UserUtils {

    /**
     * 密码加密
     * @param userPwd
     * @return
     */
    public static String getPWD(String userPwd,String salt){
        return new SimpleHash("MD5",userPwd,salt,1024).toHex();
    }

}
