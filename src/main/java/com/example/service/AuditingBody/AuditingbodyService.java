package com.example.service.AuditingBody;

import com.example.bean.Auditingbody;

import java.util.List;

public interface AuditingbodyService {
    public List<Auditingbody> findAllByParentCode(String parentCode);
}
