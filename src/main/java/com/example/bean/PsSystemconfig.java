package com.example.bean;

public class PsSystemconfig {
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
}