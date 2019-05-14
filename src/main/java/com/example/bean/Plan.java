package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "plan")
@Entity
public class Plan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planId;

    private String planName;

    private String planYear;

    private Integer planType;

    @OneToOne(fetch = FetchType.LAZY,targetEntity =Auditingbody.class)
    @JoinColumn(name = "abCode",referencedColumnName = "abCode")
    private Auditingbody auditingbody;

    private String planMouth;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public String getPlanYear() {
        return planYear;
    }

    public void setPlanYear(String planYear) {
        this.planYear = planYear == null ? null : planYear.trim();
    }

    public Integer getPlanType() {
        return planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public String getPlanMouth() {
        return planMouth;
    }

    public void setPlanMouth(String planMouth) {
        this.planMouth = planMouth == null ? null : planMouth.trim();
    }

    public Auditingbody getAuditingbody() {
        return auditingbody;
    }

    public void setAuditingbody(Auditingbody auditingbody) {
        this.auditingbody = auditingbody;
    }

    public Plan(Integer planId,String planName, String planYear, Integer planType, Auditingbody auditingbody, String planMouth) {
        this.planId=planId;
        this.planName = planName;
        this.planYear = planYear;
        this.planType = planType;
        this.auditingbody = auditingbody;
        this.planMouth = planMouth;
    }

    public Plan(String planName, String planYear, Integer planType, Auditingbody auditingbody, String planMouth) {
        this.planName = planName;
        this.planYear = planYear;
        this.planType = planType;
        this.auditingbody = auditingbody;
        this.planMouth = planMouth;
    }

    public Plan() {
    }

    @Override
    public String toString() {
        return "Plan{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", planYear='" + planYear + '\'' +
                ", planType=" + planType +
                ", auditingbody=" + auditingbody +
                ", planMouth='" + planMouth + '\'' +
                '}';
    }
}