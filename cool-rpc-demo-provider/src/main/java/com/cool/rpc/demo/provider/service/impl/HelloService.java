package com.cool.rpc.demo.provider.service.impl;

import com.cool.rpc.annotation.CoolService;
import com.cool.rpc.demo.api.IHelloService;

@CoolService(IHelloService.class)
public class HelloService implements IHelloService {

    @Override
    public String say(String msg) {
        System.out.println("服务提供端开始执行，api：" + HelloService.class.getSimpleName());
        System.out.println("接受参数msg：" + msg);
        System.out.println("执行完毕！");
        return msg;
    }
}
