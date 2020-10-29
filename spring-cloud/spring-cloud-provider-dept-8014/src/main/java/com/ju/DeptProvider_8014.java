package com.ju;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启动类
@SpringBootApplication
@EnableEurekaClient   //服务启动后自动注册到eureka
@EnableDiscoveryClient //服务发现
public class DeptProvider_8014 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8014.class, args);
    }
}
