package com.example.service.MetaphorService;

import com.example.bean.Auditingbody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AuditingbodyService {
    public List<Auditingbody> findAll();

    public Auditingbody findByAbCode(String AbCode);

    public List<Auditingbody> findByParentCode(String parentCode);
}
