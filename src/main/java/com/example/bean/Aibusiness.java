package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aibusiness")
public class Aibusiness implements Serializable {
    @Id
    private String aibCode;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Auditedinstitutions.class)
    @JoinColumn(name = "aiCode",referencedColumnName = "aiCode")
    private Auditedinstitutions auditedinstitutions;
    private String businessCode;

    public Auditedinstitutions getAuditedinstitutions() {
        return auditedinstitutions;
    }

    public void setAuditedinstitutions(Auditedinstitutions auditedinstitutions) {
        this.auditedinstitutions = auditedinstitutions;
    }

    public Aibusiness(Auditedinstitutions auditedinstitutions, String businessCode) {
        this.auditedinstitutions = auditedinstitutions;
        this.businessCode = businessCode;
    }

    public Aibusiness() {
    }

    @Override
    public String toString() {
        return "Aibusiness{" +
                "aibCode='" + aibCode + '\'' +
                ", auditedinstitutions=" + auditedinstitutions +
                ", businessCode='" + businessCode + '\'' +
                '}';
    }

    public String getAibCode() {
        return aibCode;
    }

    public Aibusiness(String aibCode, Auditedinstitutions auditedinstitutions, String businessCode) {
        this.aibCode = aibCode;
        this.auditedinstitutions = auditedinstitutions;
        this.businessCode = businessCode;
    }

    public void setAibCode(String aibCode) {
        this.aibCode = aibCode == null ? null : aibCode.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }
}