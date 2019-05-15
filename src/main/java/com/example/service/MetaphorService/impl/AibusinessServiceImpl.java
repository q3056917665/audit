package com.example.service.MetaphorService.impl;

import com.example.bean.Aibusiness;
import com.example.dao.Aibusinessdao;
import com.example.service.MetaphorService.AibusinessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AibusinessServiceImpl implements AibusinessService {
    @Resource
    private Aibusinessdao aibusinessdao;

    public List<Aibusiness> getAibusinessAll(){
        return aibusinessdao.findAll();
    }
}
