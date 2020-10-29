package com.ju.controller;

import com.ju.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class helloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "helloSpring Mvc");
        return "hello";
    }

    @RequestMapping(value = "/h/{a}/{b}",method = RequestMethod.GET)
    public String h(@PathVariable String a, @PathVariable String b, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        return "redirect:hello";
    }

    @GetMapping("/user")
    public String user(User user, Model model) {
        model.addAttribute("msg", user.getName());
        return "hello";
    }

    @GetMapping("/user2")
    public String user2(@RequestParam("username") String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }

}
