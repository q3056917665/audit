package com.example.bean;

import java.util.Date;

public class Knowledgebase {
    private String kbCode;

    private String kbName;

    private String kbPath;

    private Date kbDate;

    private String kbStatus;

    private String userCode;

    public String getKbCode() {
        return kbCode;
    }

    public void setKbCode(String kbCode) {
        this.kbCode = kbCode == null ? null : kbCode.trim();
    }

    public String getKbName() {
        return kbName;
    }

    public void setKbName(String kbName) {
        this.kbName = kbName == null ? null : kbName.trim();
    }

    public String getKbPath() {
        return kbPath;
    }

    public void setKbPath(String kbPath) {
        this.kbPath = kbPath == null ? null : kbPath.trim();
    }

    public Date getKbDate() {
        return kbDate;
    }

    public void setKbDate(Date kbDate) {
        this.kbDate = kbDate;
    }

    public String getKbStatus() {
        return kbStatus;
    }

    public void setKbStatus(String kbStatus) {
        this.kbStatus = kbStatus == null ? null : kbStatus.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }
}