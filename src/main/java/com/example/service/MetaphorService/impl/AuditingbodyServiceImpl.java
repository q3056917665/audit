package com.example.service.MetaphorService.impl;

import com.example.bean.Auditingbody;
import com.example.dao.Auditingbodydao;
import com.example.service.MetaphorService.AuditingbodyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class AuditingbodyServiceImpl implements AuditingbodyService {
    @Resource
    private Auditingbodydao auditingbodydao;

    @Override
    public List<Auditingbody> findAll() {
        return auditingbodydao.findAll();
    }

    @Override
    public Auditingbody findByAbCode(String AbCode) {
        Optional<Auditingbody> byId =auditingbodydao.findById(AbCode);
        return byId.get();
    }

    @Override
    public List<Auditingbody> findByParentCode(String parentCode) {
        return auditingbodydao.findByParentCode(parentCode);
    }
}
