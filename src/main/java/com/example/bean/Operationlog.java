package com.example.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "operationlog")
public class Operationlog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer olCode;


    private String userCode;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")  //入参
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")   //出参
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

    public Operationlog(Integer olCode, Date olDate, String olCompany, String olModule, String olType, String olContext) {
        this.olCode=olCode;
        this.olDate = olDate;
        this.olCompany = olCompany;
        this.olModule = olModule;
        this.olType = olType;
        this.olContext = olContext;
    }

    public Operationlog( Date olDate, String olCompany, String olModule, String olType, String olContext) {
        this.olDate = olDate;
        this.olCompany = olCompany;
        this.olModule = olModule;
        this.olType = olType;
        this.olContext = olContext;
    }

    public Operationlog() {
    }

    @Override
    public String toString() {
        return "Operationlog{" +
                "olCode=" + olCode +
                ", olDate=" + olDate +
                ", olCompany='" + olCompany + '\'' +
                ", olModule='" + olModule + '\'' +
                ", olType='" + olType + '\'' +
                ", olContext='" + olContext + '\'' +
                '}';
    }
}