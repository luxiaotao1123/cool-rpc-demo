package com.cool.rpc.demo.consumer;

import com.cool.rpc.demo.consumer.service.impl.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerBoot {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConsumerBoot.class, args);
        ConsumerService service = ctx.getBean(ConsumerService.class);
        service.consumer();
    }
}
