package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ps_systemconfig")
public class PsSystemconfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer psId;

    private String configcode;

    private String configname;

    private Integer configvalueid;

    private String configvaluename;

    private Integer isstart;

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getConfigcode() {
        return configcode;
    }

    public void setConfigcode(String configcode) {
        this.configcode = configcode == null ? null : configcode.trim();
    }

    public String getConfigname() {
        return configname;
    }

    public void setConfigname(String configname) {
        this.configname = configname == null ? null : configname.trim();
    }

    public Integer getConfigvalueid() {
        return configvalueid;
    }

    public void setConfigvalueid(Integer configvalueid) {
        this.configvalueid = configvalueid;
    }

    public String getConfigvaluename() {
        return configvaluename;
    }

    public void setConfigvaluename(String configvaluename) {
        this.configvaluename = configvaluename == null ? null : configvaluename.trim();
    }

    public Integer getIsstart() {
        return isstart;
    }

    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    public PsSystemconfig(Integer psId,String configcode, String configname, Integer configvalueid, String configvaluename, Integer isstart) {
        this.psId=psId;
        this.configcode = configcode;
        this.configname = configname;
        this.configvalueid = configvalueid;
        this.configvaluename = configvaluename;
        this.isstart = isstart;
    }

    public PsSystemconfig(String configcode, String configname, Integer configvalueid, String configvaluename, Integer isstart) {
        this.configcode = configcode;
        this.configname = configname;
        this.configvalueid = configvalueid;
        this.configvaluename = configvaluename;
        this.isstart = isstart;
    }

    public PsSystemconfig() {
    }

    @Override
    public String toString() {
        return "PsSystemconfig{" +
                "psId=" + psId +
                ", configcode='" + configcode + '\'' +
                ", configname='" + configname + '\'' +
                ", configvalueid=" + configvalueid +
                ", configvaluename='" + configvaluename + '\'' +
                ", isstart=" + isstart +
                '}';
    }
}