package com.ju.springboot05security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

    @RequestMapping({"/", "index"})
    public String index() {
        return "index";
    }


    @RequestMapping("/toLogin")
    public String login() {
        return "login";
    }


    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable Integer id) {
        return "views/level1/" + id.toString();
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable Integer id) {
        return "views/level2/" + id.toString();
    }

    @RequestMapping("/level3/{id}")
    public String level3(@PathVariable Integer id) {
        return "views/level3/" + id.toString();
    }

}
