package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "auditingbody")
public class Auditingbody implements Serializable {
    @Id
    private String abCode;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Auditingbody.class)
    @JoinColumn(name = "parentCode", referencedColumnName = "abCode")
    private Auditingbody auditingbody;

    private String abName;

    @Override
    public String toString() {
        return "Auditingbody{" +
                "abCode='" + abCode + '\'' +
                ", auditingbody=" + auditingbody +
                ", abName='" + abName + '\'' +
                '}';
    }

    public Auditingbody() {
    }

    public Auditingbody(Auditingbody auditingbody, String abName) {
        this.auditingbody = auditingbody;
        this.abName = abName;
    }

    public Auditingbody(String abCode, Auditingbody auditingbody, String abName) {
        this.abCode = abCode;
        this.auditingbody = auditingbody;
        this.abName = abName;
    }

    public Auditingbody getAuditingbody() {
        return auditingbody;
    }

    public void setAuditingbody(Auditingbody auditingbody) {
        this.auditingbody = auditingbody;
    }

    public String getAbCode() {
        return abCode;
    }

    public void setAbCode(String abCode) {
        this.abCode = abCode == null ? null : abCode.trim();
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName == null ? null : abName.trim();
    }
}