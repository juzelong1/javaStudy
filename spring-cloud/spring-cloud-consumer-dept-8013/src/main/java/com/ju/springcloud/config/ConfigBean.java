package com.ju.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration   //相当于spring中的applicationContext.yml
public class ConfigBean {
    //配置负载均衡
    @Bean
    @LoadBalanced //ribbon
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
