package com.ju.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//启动类
@SpringBootApplication
@EnableHystrixDashboard
public class hystrix_dashboad {
    public static void main(String[] args) {
        SpringApplication.run(hystrix_dashboad.class, args);
    }
}
