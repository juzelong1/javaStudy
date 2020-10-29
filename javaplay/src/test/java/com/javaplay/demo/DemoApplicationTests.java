package com.javaplay.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    people p;


    @Test
    void contextLoads() {
        System.out.println(p.read());

    }

}
