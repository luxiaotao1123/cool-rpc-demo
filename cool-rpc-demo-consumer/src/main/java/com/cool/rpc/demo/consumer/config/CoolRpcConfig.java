package com.cool.rpc.demo.consumer.config;

import com.cool.rpc.CoolProxy;
import com.cool.rpc.center.ServiceCenter;
import com.cool.rpc.center.ZooKeeperServiceDiscovery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoolRpcConfig {

    /** 注册中心--服务发现 */
    @Bean
    ServiceCenter getServiceDiscovery(){
        return new ZooKeeperServiceDiscovery("106.15.205.155",2181);
    }

    @Bean("coolProxy")
    CoolProxy getCoolProxy(){
        return new CoolProxy(getServiceDiscovery());
    }

}
