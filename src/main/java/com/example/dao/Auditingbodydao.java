package com.example.dao;

import com.example.bean.Auditingbody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Auditingbodydao extends
        JpaRepository<Auditingbody,String> {
    List<Auditingbody> findByParentCode(String parentCode);
}
