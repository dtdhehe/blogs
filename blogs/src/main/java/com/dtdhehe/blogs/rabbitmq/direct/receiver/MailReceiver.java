package com.dtdhehe.blogs.rabbitmq.direct.receiver;

import com.dtdhehe.blogs.config.RabbitConfig;
import com.dtdhehe.blogs.service.MessageService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/12 16:22
 * @description
 **/
@Component
@RabbitListener(queues = RabbitConfig.MAIL_DIRECT_QUEUE)
public class MailReceiver {

    @Autowired
    MessageService messageService;


    @RabbitHandler
    public void process(String email){
        System.out.println("接受到的消息为："+email);
        try {
            messageService.sendHtmlMail(email,"用户注册","点击<a href='www.baidu.com'>此处</a>激活账号");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
