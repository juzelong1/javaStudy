package com.ju.controller;

import com.ju.service.DeptService;
import com.ju.springcloud.pojo.Dept;
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

    @RequestMapping("/dept/add")
    @ResponseBody
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping("/dept/get/{id}")
    @ResponseBody
    public Dept queryById(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @RequestMapping("/dept/getAll")
    @ResponseBody
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    //注册进来的微服务，获取一些消息
    @RequestMapping("/dept/discovery")
    @ResponseBody
    public Object discovery() {
        //获取微服务列表
        List<String> services = discoveryClient.getServices();
        System.out.println(services);

        //得到一个具体的服务信息 通过application_name
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );
        }

        return this.discoveryClient;


    }


}
