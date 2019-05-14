
package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 被审计机构开展的业务
 */
@Entity
@Table(name = "aibusiness")
public class Aibusiness implements Serializable {
    /**
     * 编号
     */
    @Id
    private String aibCode;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Auditedinstitutions.class)
    @JoinColumn(name = "aiCode",referencedColumnName = "aiCode")
    private Auditedinstitutions auditedinstitutions;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = PsSystemconfig.class)
    @JoinColumn(name = "businessCode",referencedColumnName ="psId")
    private PsSystemconfig psSystemconfig;

    public Auditedinstitutions getAuditedinstitutions() {
        return auditedinstitutions;
    }

    public void setAuditedinstitutions(Auditedinstitutions auditedinstitutions) {
        this.auditedinstitutions = auditedinstitutions;
    }

    public String getAibCode() {
        return aibCode;
    }

    public void setAibCode(String aibCode) {
        this.aibCode = aibCode == null ? null : aibCode.trim();
    }

    public PsSystemconfig getPsSystemconfig() {
        return psSystemconfig;
    }

    public void setPsSystemconfig(PsSystemconfig psSystemconfig) {
        this.psSystemconfig = psSystemconfig;
    }

    public Aibusiness(String aibCode, Auditedinstitutions auditedinstitutions, PsSystemconfig psSystemconfig) {
        this.aibCode = aibCode;
        this.auditedinstitutions = auditedinstitutions;
        this.psSystemconfig = psSystemconfig;
    }

    public Aibusiness(Auditedinstitutions auditedinstitutions, PsSystemconfig psSystemconfig) {
        this.auditedinstitutions = auditedinstitutions;
        this.psSystemconfig = psSystemconfig;
    }

    public Aibusiness() {
    }

    @Override
    public String toString() {
        return "Aibusiness{" +
                "aibCode='" + aibCode + '\'' +
                ", auditedinstitutions=" + auditedinstitutions +
                ", psSystemconfig=" + psSystemconfig +
                '}';
    }
}