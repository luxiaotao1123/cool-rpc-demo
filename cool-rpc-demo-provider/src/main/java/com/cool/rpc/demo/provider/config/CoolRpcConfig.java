package com.cool.rpc.demo.provider.config;

import com.cool.rpc.RpcServer;
import com.cool.rpc.center.ServiceCenter;
import com.cool.rpc.center.ZooKeeperServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoolRpcConfig {

    /** 注册中心--服务注册 */
    @Bean
    ServiceCenter getServiceRegistry(){
        return new ZooKeeperServiceRegistry("106.15.205.155",2181);
    }

    @Bean
    RpcServer getRpcServer(){
        return new RpcServer(getServiceRegistry());
    }
}
