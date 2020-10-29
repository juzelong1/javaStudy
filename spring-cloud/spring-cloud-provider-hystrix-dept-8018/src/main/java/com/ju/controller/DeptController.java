package com.ju.controller;

import com.ju.service.DeptService;
import com.ju.springcloud.pojo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    //获取具体的微服务列表
    @Autowired
    private DiscoveryClient discoveryClient;


    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    @RequestMapping("/dept/get/{id}")
    @ResponseBody
    public Dept queryById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("id不存在");
        }

        return deptService.queryById(id);
    }

    //备选方案
    @ResponseBody
    public Dept hystrixQueryById(@PathVariable("id") Long id){
        return new Dept().
                setDeptNO(id).
                setDname("id不存在=>hystrix!!").
                setDb_source("no db");
    }



}
