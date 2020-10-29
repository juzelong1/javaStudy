package com.ju.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ju.springcloud"})
public class FeignDeptConsumer_8013 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_8013.class, args);
    }
}
