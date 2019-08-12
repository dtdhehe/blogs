package com.dtdhehe.blogs.service;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/12 15:20
 * @description
 **/
public interface MessageService {

    /**
     * 发送html邮件
     * @param to        :接收者
     * @param subject   :主题
     * @param content   :内容
     * @throws Exception :异常处理
     */
    void sendHtmlMail(String to, String subject, String content) throws Exception;

}
