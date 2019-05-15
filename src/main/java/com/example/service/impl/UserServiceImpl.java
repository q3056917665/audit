package com.example.service.impl;

import com.example.bean.User;
import com.example.dao.Userdao;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private Userdao userdao;

    @Override
    public User login(String userCode, String userPwd) {
        return userdao.findByUserCodeAndUserPassword(userCode,userPwd);
    }
}
