package com.example.bean;

import java.util.Date;

public class Jobdiary {
    private Integer jdCode;

    private Integer proId;

    private Date workDate;

    private String jdContext;

    private String jdQuestion;

    private String jdMatter;

    private String jdPlan;

    private String userCode;

    private Date submitDate;

    public Integer getJdCode() {
        return jdCode;
    }

    public void setJdCode(Integer jdCode) {
        this.jdCode = jdCode;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getJdContext() {
        return jdContext;
    }

    public void setJdContext(String jdContext) {
        this.jdContext = jdContext == null ? null : jdContext.trim();
    }

    public String getJdQuestion() {
        return jdQuestion;
    }

    public void setJdQuestion(String jdQuestion) {
        this.jdQuestion = jdQuestion == null ? null : jdQuestion.trim();
    }

    public String getJdMatter() {
        return jdMatter;
    }

    public void setJdMatter(String jdMatter) {
        this.jdMatter = jdMatter == null ? null : jdMatter.trim();
    }

    public String getJdPlan() {
        return jdPlan;
    }

    public void setJdPlan(String jdPlan) {
        this.jdPlan = jdPlan == null ? null : jdPlan.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }
}