package com.dtdhehe.blogs.service.impl;

import com.dtdhehe.blogs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/12 15:23
 * @description
 **/
@Service
public class MessageServiceImpl implements MessageService {

    /**
     * 把配置文件中的属性注入
     */
    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private JavaMailSender mailSender;
    @Override
    public void sendHtmlMail(String to, String subject, String content) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);
        helper.setTo(to);
        helper.setSubject(subject);
        //发送html邮件时需设置为true
        helper.setText(content,true);
        helper.setFrom(from);
        mailSender.send(message);
    }
}
