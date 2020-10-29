package com.ju.springbootconsumer02.com.ju.controller;

import com.ju.springbootconsumer02.com.ju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @Autowired
    private UserService userService;


    @RequestMapping("/haha")
    @ResponseBody
    public String getService() {
        return userService.getTicket();
    }

}
