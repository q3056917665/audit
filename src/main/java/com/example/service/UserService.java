package com.example.service;

import com.example.bean.User;

public interface UserService {

    User login(String userCode,String userPwd);
}
