package com.example.bean;

public class Auditingbody {
    private String abCode;

    private String parentCode;

    private String abName;

    public String getAbCode() {
        return abCode;
    }

    public void setAbCode(String abCode) {
        this.abCode = abCode == null ? null : abCode.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName == null ? null : abName.trim();
    }
}