package com.ju.shiro02;

import com.ju.shiro02.pojo.User;
import com.ju.shiro02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Shiro02ApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = userService.getUserByName("居泽龙");
        System.out.println(user);
    }

}
