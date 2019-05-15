package com.example.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "auditingbody")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Auditingbody implements Serializable {
    @Id
    private String abCode;

    private String parentCode;

    private String abName;

    public Auditingbody() {
    }

    public String getParentCode() {
        return parentCode;
    }


    @Override
    public String toString() {
        return "Auditingbody{" +
                "abCode='" + abCode + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", abName='" + abName + '\'' +
                '}';
    }

    public Auditingbody(String parentCode, String abName) {
        this.parentCode = parentCode;
        this.abName = abName;
    }

    public Auditingbody(String abCode, String parentCode, String abName) {
        this.abCode = abCode;
        this.parentCode = parentCode;
        this.abName = abName;
    }

    public String getAbCode() {
        return abCode;
    }

    public void setAbCode(String abCode) {
        this.abCode = abCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName;
    }

}