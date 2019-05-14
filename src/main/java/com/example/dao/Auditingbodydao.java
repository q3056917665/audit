package com.example.dao;

import com.example.bean.Auditingbody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Auditingbodydao extends
        JpaRepository<Auditingbody,String> {
}
