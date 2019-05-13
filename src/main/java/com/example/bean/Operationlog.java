package com.example.bean;

import java.util.Date;

public class Operationlog {
    private Integer olCode;

    private String userCode;

    private Date olDate;

    private String olCompany;

    private String olModule;

    private String olType;

    private String olContext;

    public Integer getOlCode() {
        return olCode;
    }

    public void setOlCode(Integer olCode) {
        this.olCode = olCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getOlDate() {
        return olDate;
    }

    public void setOlDate(Date olDate) {
        this.olDate = olDate;
    }

    public String getOlCompany() {
        return olCompany;
    }

    public void setOlCompany(String olCompany) {
        this.olCompany = olCompany == null ? null : olCompany.trim();
    }

    public String getOlModule() {
        return olModule;
    }

    public void setOlModule(String olModule) {
        this.olModule = olModule == null ? null : olModule.trim();
    }

    public String getOlType() {
        return olType;
    }

    public void setOlType(String olType) {
        this.olType = olType == null ? null : olType.trim();
    }

    public String getOlContext() {
        return olContext;
    }

    public void setOlContext(String olContext) {
        this.olContext = olContext == null ? null : olContext.trim();
    }
}