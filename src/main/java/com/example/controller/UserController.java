package com.example.controller;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "loginJsp")
    public String loginJsp(){
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(String userCode,String userPassword){
        System.out.println(userCode+userPassword);
        return "登录成功";
    }
}
