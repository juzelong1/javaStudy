package com.ju.springcloud.controller;

import com.ju.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //private static final String restUrlPrefix= "http://localhost:8011";

    //通过ribbon获得地址的变量,通过eureka的服务名进行访问
    private static final String restUrlPrefix = "http://SPRINGCLOUD-PROVIDER-DEPT";


    //springcloud中是以restful风格进行通信
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(restUrlPrefix + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean post(Dept dept) {
        System.out.println(dept.getDname());
        return restTemplate.postForObject(restUrlPrefix + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/queryAll")
    public List<Dept> getDeptList(Dept dept) {
        return restTemplate.getForObject(restUrlPrefix + "/dept/getAll", List.class);
    }




}
