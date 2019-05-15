package com.example.controller.lfq;


import com.example.bean.Operationlog;
import com.example.service.OperationlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LogController {

    @Resource
    private OperationlogService logService;



    @RequestMapping("/Operation")
    @ResponseBody
    public List<Operationlog> OpreationLog(){
        return logService.findAll();
    }


    @RequestMapping("/toOperation")
    public String toOpreationLog(){ return "Operation"; }


    @RequestMapping("/searchLog")
    @ResponseBody
    public List<Operationlog> searchLog(String context){
        return logService.findgjz(context);
    }

    @RequestMapping("/searchPlusLog")
    @ResponseBody
    public List<Operationlog> searchPlusLog(String context,String startTime,String endTime,String model,String userCode ) throws ParseException {
        Date start=null;
        Date end=null;
        if (startTime!=""&&endTime!=""){
            start=new SimpleDateFormat("yyyy-MM-dd").parse(startTime);
            end= new SimpleDateFormat("yyyy-MM-dd").parse(endTime);
        }else {
            start=new SimpleDateFormat("yyyy-MM-dd").parse("0000-00-00");
            end= new SimpleDateFormat("yyyy-MM-dd").parse("0000-00-00");
        }

        return logService.findSearchPlus(userCode,start,end,context);
    }

}
