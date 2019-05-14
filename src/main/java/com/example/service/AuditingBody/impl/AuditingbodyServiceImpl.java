package com.example.service.AuditingBody.impl;

import com.example.bean.Auditingbody;
import com.example.dao.Auditingbodydao;
import com.example.service.AuditingBody.AuditingbodyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AuditingbodyServiceImpl implements AuditingbodyService {
    @Resource
    private Auditingbodydao auditingbodydao;

    @Override
    public List<Auditingbody> findAllByParentCode(String parentCode) {
        return auditingbodydao.findByParentCode(parentCode);
    }
}
