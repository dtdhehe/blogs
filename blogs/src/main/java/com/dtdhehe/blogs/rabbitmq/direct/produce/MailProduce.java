package com.dtdhehe.blogs.rabbitmq.direct.produce;

import com.dtdhehe.blogs.config.RabbitConfig;
import com.dtdhehe.blogs.util.ConstantUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/12 17:23
 * @description
 **/
@Component
public class MailProduce {

    @Autowired
    RabbitTemplate rabbitTemplate;
    public Integer sender(String email){
        try {
            rabbitTemplate.convertAndSend(RabbitConfig.MAIL_DIRECT_EXCHANGE,RabbitConfig.MAIL_ROUTING_KEY,email);
            System.out.println("发送消息:"+email+",发送时间:"+ new Date());
        }catch (Exception e){
            return ConstantUtils.FAILED;
        }
        return ConstantUtils.SUCCESS;
    }
}
