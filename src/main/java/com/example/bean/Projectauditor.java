package com.example.bean;

public class Projectauditor {
    private Integer paId;

    private String userCode;

    private Integer proId;

    private Integer paIdentity;

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
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

    public Integer getPaIdentity() {
        return paIdentity;
    }

    public void setPaIdentity(Integer paIdentity) {
        this.paIdentity = paIdentity;
    }
}