package com.ju.springboot04.controller;

import com.alibaba.fastjson.JSON;
import com.ju.springboot04.Mapper.UserMapper;
import com.ju.springboot04.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/hello")
    public String getHello() {
        String sql = "select * from student";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);

        return  JSON.toJSONString(maps);
    }


    @RequestMapping("/hello2")
    public String getUserList() {
        List<User> userList = userMapper.getUserList();
        return  JSON.toJSONString(userList);
    }


}
