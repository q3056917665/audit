package com.example.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "auditedinstitutions")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Auditedinstitutions implements Serializable {
    @Id
    private String aiCode;

    private String aiName;

    private Date aiCreateDate;

    private Date aiDate;

    private String aiParentCode;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Auditingbody.class)
    @JoinColumn(name = "abCode",referencedColumnName = "abCode")
    private Auditingbody auditingbody;

    @OneToMany(fetch = FetchType.LAZY,targetEntity =Aibusiness.class,mappedBy = "auditedinstitutions")
    private List<Aibusiness> aibusinesses=new ArrayList<>();

    public List<Aibusiness> getAibusinesses() {
        return aibusinesses;
    }

    public void setAibusinesses(List<Aibusiness> aibusinesses) {
        this.aibusinesses = aibusinesses;
    }

    public String getAiCode() {
        return aiCode;
    }

    public void setAiCode(String aiCode) {
        this.aiCode = aiCode == null ? null : aiCode.trim();
    }

    public String getAiName() {
        return aiName;
    }

    public void setAiName(String aiName) {
        this.aiName = aiName == null ? null : aiName.trim();
    }

    public Date getAiCreateDate() {
        return aiCreateDate;
    }

    public void setAiCreateDate(Date aiCreateDate) {
        this.aiCreateDate = aiCreateDate;
    }

    public Date getAiDate() {
        return aiDate;
    }

    public void setAiDate(Date aiDate) {
        this.aiDate = aiDate;
    }

    public String getAiParentCode() {
        return aiParentCode;
    }

    public void setAiParentCode(String aiParentCode) {
        this.aiParentCode = aiParentCode == null ? null : aiParentCode.trim();
    }

    public Auditingbody getAuditingbody() {
        return auditingbody;
    }
    public void setAuditingbody(Auditingbody auditingbody) {
        this.auditingbody = auditingbody;
    }
    public Auditedinstitutions(String aiCode, String aiName, Date aiCreateDate, Date aiDate, String aiParentCode, Auditingbody auditingbody) {
        this.aiCode = aiCode;
        this.aiName = aiName;
        this.aiCreateDate = aiCreateDate;
        this.aiDate = aiDate;
        this.aiParentCode = aiParentCode;
        this.auditingbody = auditingbody;
    }

    public Auditedinstitutions(String aiName, Date aiCreateDate, Date aiDate, String aiParentCode, Auditingbody auditingbody) {
        this.aiName = aiName;
        this.aiCreateDate = aiCreateDate;
        this.aiDate = aiDate;
        this.aiParentCode = aiParentCode;
        this.auditingbody = auditingbody;
    }

    @Override
    public String toString() {
        return "Auditedinstitutions{" +
                "aiCode='" + aiCode + '\'' +
                ", aiName='" + aiName + '\'' +
                ", aiCreateDate=" + aiCreateDate +
                ", aiDate=" + aiDate +
                ", aiParentCode='" + aiParentCode + '\'' +
                ", auditingbody=" + auditingbody +
                '}';
    }

    public Auditedinstitutions() {
    }
}