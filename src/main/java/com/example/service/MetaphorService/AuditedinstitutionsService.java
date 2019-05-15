package com.example.service.MetaphorService;

import com.example.bean.Auditedinstitutions;
import com.example.bean.Auditingbody;

import java.util.List;

public interface AuditedinstitutionsService {
    public List<Auditedinstitutions> findAll(String abCode);

    public List<Auditedinstitutions> findByZong(List<Auditingbody> list);
}
