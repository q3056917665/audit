package com.example.controller.lfq;


import com.example.aop.Log;
import com.example.bean.Operationlog;
import com.example.bean.User;
import com.example.service.OperationlogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class testController {

    @Resource
    private OperationlogService logService;

    @RequestMapping("/setuser")
    public String testuser(HttpServletRequest request){
        User user=new User();
        user.setUserCode("15848635817@qq.com");
        request.getSession().setAttribute("user",user);
        return null;
    }

    @RequestMapping("/test1")
    @Log(module = "日志",content = "查询操作日志",type = "查询")
    public List<Operationlog> test(){
        return logService.findAll();
    }
}
