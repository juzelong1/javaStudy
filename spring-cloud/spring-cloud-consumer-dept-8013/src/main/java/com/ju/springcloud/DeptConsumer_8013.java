package com.ju.springcloud;

import com.ju.springcloud.myrule.JuRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = JuRule.class)
public class DeptConsumer_8013 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_8013.class, args);
    }

}
