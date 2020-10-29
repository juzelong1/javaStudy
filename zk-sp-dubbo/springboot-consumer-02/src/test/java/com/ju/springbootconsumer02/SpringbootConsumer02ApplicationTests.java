package com.ju.springbootconsumer02;

import com.ju.springbootconsumer02.com.ju.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootConsumer02ApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.getTicket();
    }

}
