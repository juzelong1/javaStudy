package com.ju.shiro02.service;

import com.ju.shiro02.mapper.UserMapper;
import com.ju.shiro02.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String username) {
        return userMapper.queryUserByName(username);
    }
}
