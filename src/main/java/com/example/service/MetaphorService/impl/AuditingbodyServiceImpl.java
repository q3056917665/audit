package com.example.service.MetaphorService.impl;

import com.example.bean.Auditingbody;
import com.example.dao.Auditingbodydao;
import com.example.service.MetaphorService.AuditingbodyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
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

    @Transactional
    @Override
    public String addAuditBody(String abCode,String parentCode,String abName) {
        if(abCode==""||abName==""){
             return "00";
        }else{
            Auditingbody auditingbody=new Auditingbody(abCode,parentCode,abName);
            Auditingbody save = auditingbodydao.save(auditingbody);
            if(save!=null){
                return "1";
            }else{
                return "0";
            }
        }
    }

    @Transactional
    @Override
    public boolean removeAuditBodyByAbCode(String abCode) {
        try {
            auditingbodydao.deleteById(abCode);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return  false;
        }
    }

    @Transactional
    @Override
    public boolean removeAduitBodyParentCode(String parentCode) {
        try {
            auditingbodydao.deleteByParentCode(parentCode);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
