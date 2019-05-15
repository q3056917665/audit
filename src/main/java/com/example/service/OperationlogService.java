package com.example.service;


import com.example.bean.Operationlog;
import com.example.dao.Operationlogdao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OperationlogService {

    @Resource
    private Operationlogdao dao;

    public List<Operationlog> findAll(){
        return dao.findAll();
    }

    @Transactional
    public void addLog(Operationlog log){
          dao.save(log);
    }

    public List<Operationlog> findgjz(String context){
        return  dao.findByOlContextLike("%"+context+"%");
    }

    public List<Operationlog> findSearchPlus(String usercode, Date start,Date end,String context){
        return dao.findSearchPlus(usercode,start,end,context);
    }
}
