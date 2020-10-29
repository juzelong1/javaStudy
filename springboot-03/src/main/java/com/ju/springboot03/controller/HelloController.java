package com.ju.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("array", Arrays.asList("jzl", "kg"));
        model.addAttribute("msg", "hello,springboot");
        return "test";
    }

}
