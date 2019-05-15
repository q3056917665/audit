package com.example.dao;

import com.example.bean.Auditedinstitutions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Auditedinstitutionsdao
        extends JpaRepository<Auditedinstitutions,String> {
    public List<Auditedinstitutions> findAuditedinstitutionsByAuditingbody_AbCode(String abCode);
}
