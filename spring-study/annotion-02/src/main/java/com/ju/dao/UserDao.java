package com.ju.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
