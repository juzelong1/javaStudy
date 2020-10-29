package com.javaplay.demo;

import org.springframework.stereotype.Service;

@Service
public class peopleImpl implements people {
    @Override
    public String read() {
        return "=================这是晚晚晚安====================";
    }
}
