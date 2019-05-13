package com.example.bean;

public class ProjectMember {
    private Integer pmId;

    private String userCode;

    private Integer proId;

    private Integer pmIdentity;

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getPmIdentity() {
        return pmIdentity;
    }

    public void setPmIdentity(Integer pmIdentity) {
        this.pmIdentity = pmIdentity;
    }
}