package com.dtdhehe.blogs.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Xie_东
 * @version 1.0
 * @date 2019/8/12 16:03
 * @description RabbitMQ配置类
 **/
@Configuration
public class RabbitConfig {

    public static final String MAIL_DIRECT_QUEUE = "mailDirectQueue";
    public static final String MAIL_DIRECT_EXCHANGE = "mailDirectExchange";
    public static final String MAIL_ROUTING_KEY = "mailDirectRouting";

    /**
     * 邮件消息队列
     * @return
     */
    @Bean(name = MAIL_DIRECT_QUEUE)
    public Queue mailDirectQueue(){
        return new Queue(MAIL_DIRECT_QUEUE,true);
    }

    /**
     * 邮件消息交换机
     * @return
     */
    @Bean(name = MAIL_DIRECT_EXCHANGE)
    public DirectExchange mailDirectExchange(){
        return new DirectExchange(MAIL_DIRECT_EXCHANGE);
    }

    @Bean
    public Binding bindingDirect(@Qualifier(MAIL_DIRECT_EXCHANGE)DirectExchange exchange,
                                 @Qualifier(MAIL_DIRECT_QUEUE)Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(MAIL_ROUTING_KEY);
    }
}
