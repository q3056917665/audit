package com.example.service.MetaphorService.impl;

import com.example.bean.Auditedinstitutions;
import com.example.bean.Auditingbody;
import com.example.dao.Auditedinstitutionsdao;
import com.example.service.MetaphorService.AuditedinstitutionsService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class AuditedinstitutionServiceImpl implements AuditedinstitutionsService {
    @Resource
    private Auditedinstitutionsdao auditedinstitutionsdao;

    @Override
    public List<Auditedinstitutions> findAll(String abCode) {
        return auditedinstitutionsdao.findAuditedinstitutionsByAuditingbody_AbCode(abCode);
    }

    @Override
    public List<Auditedinstitutions> findByZong(List<Auditingbody> list) {
        List<Auditedinstitutions> allAudit=new ArrayList<>();
        List<Integer> index=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            List<Auditedinstitutions> auditedinstitutionsByAuditingbody_abCode = auditedinstitutionsdao.findAuditedinstitutionsByAuditingbody_AbCode(list.get(i).getAbCode());
            for (int j=0;j<auditedinstitutionsByAuditingbody_abCode.size();j++){
                if(!index.contains(auditedinstitutionsByAuditingbody_abCode.get(j))){
                     allAudit.add(auditedinstitutionsByAuditingbody_abCode.get(j));
                }else{
                    j--;
                }
            }
        }
        return allAudit;
    }
}
