package com.example.bean;

import java.util.Date;

public class Project {
    private Integer proId;

    private String proName;

    private Integer proType;

    private String aiCode;

    private Date aiStartDate;

    private Date aiEndDate;

    private Date implementStratDate;

    private Date implementEndDate;

    private Integer proStage;

    private String userCode;

    private Integer planId;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProType() {
        return proType;
    }

    public void setProType(Integer proType) {
        this.proType = proType;
    }

    public String getAiCode() {
        return aiCode;
    }

    public void setAiCode(String aiCode) {
        this.aiCode = aiCode == null ? null : aiCode.trim();
    }

    public Date getAiStartDate() {
        return aiStartDate;
    }

    public void setAiStartDate(Date aiStartDate) {
        this.aiStartDate = aiStartDate;
    }

    public Date getAiEndDate() {
        return aiEndDate;
    }

    public void setAiEndDate(Date aiEndDate) {
        this.aiEndDate = aiEndDate;
    }

    public Date getImplementStratDate() {
        return implementStratDate;
    }

    public void setImplementStratDate(Date implementStratDate) {
        this.implementStratDate = implementStratDate;
    }

    public Date getImplementEndDate() {
        return implementEndDate;
    }

    public void setImplementEndDate(Date implementEndDate) {
        this.implementEndDate = implementEndDate;
    }

    public Integer getProStage() {
        return proStage;
    }

    public void setProStage(Integer proStage) {
        this.proStage = proStage;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
}