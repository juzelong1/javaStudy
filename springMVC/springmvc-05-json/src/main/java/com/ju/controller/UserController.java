package com.ju.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ju.pojo.User;
import com.ju.utils.jsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping(value = "/t1")
    @ResponseBody
    public String user() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("居泽龙", 18, "男", new Date());

        String s = new jsonUtils().getJson(user);

        return s;
    }

    @RequestMapping(value = "/t2")
    @ResponseBody
    public String userInfo() {
        User user = new User("居泽龙", 18, "男", new Date());
        User user2 = new User("居泽龙", 18, "男", new Date());
        User user3 = new User("居泽龙", 18, "男", new Date());
        User user4 = new User("居泽龙", 18, "男", new Date());
        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        String s = JSON.toJSONString(users);
        return s;

    }


}
