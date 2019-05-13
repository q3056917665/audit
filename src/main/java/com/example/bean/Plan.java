package com.example.bean;

public class Plan {
    private Integer planId;

    private String planName;

    private String planYear;

    private Integer planType;

    private String abCode;

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

    public String getAbCode() {
        return abCode;
    }

    public void setAbCode(String abCode) {
        this.abCode = abCode == null ? null : abCode.trim();
    }

    public String getPlanMouth() {
        return planMouth;
    }

    public void setPlanMouth(String planMouth) {
        this.planMouth = planMouth == null ? null : planMouth.trim();
    }
}