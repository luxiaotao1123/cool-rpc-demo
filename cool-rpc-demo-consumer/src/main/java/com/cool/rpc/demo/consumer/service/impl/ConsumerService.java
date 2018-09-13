package com.cool.rpc.demo.consumer.service.impl;

import com.cool.rpc.CoolProxy;
import com.cool.rpc.demo.api.IHelloService;
import com.cool.rpc.demo.consumer.service.IConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConsumerService implements IConsumerService {

    @Resource
    private CoolProxy coolProxy;

    @Override
    public void consumer() {
        IHelloService helloService = coolProxy.getInstance(IHelloService.class);
        String result = helloService.say("hello world");
        System.out.println(result);
    }
}
