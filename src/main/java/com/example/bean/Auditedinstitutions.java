package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "auditedinstitutions")
public class Auditedinstitutions implements Serializable {
    private String aiCode;

    private String aiName;

    private Date aiCreateDate;

    private Date aiDate;

    private String aiParentCode;

    private String abCode;

    public String getAiCode() {
        return aiCode;
    }

    public void setAiCode(String aiCode) {
        this.aiCode = aiCode == null ? null : aiCode.trim();
    }

    public String getAiName() {
        return aiName;
    }

    public void setAiName(String aiName) {
        this.aiName = aiName == null ? null : aiName.trim();
    }

    public Date getAiCreateDate() {
        return aiCreateDate;
    }

    public void setAiCreateDate(Date aiCreateDate) {
        this.aiCreateDate = aiCreateDate;
    }

    public Date getAiDate() {
        return aiDate;
    }

    public void setAiDate(Date aiDate) {
        this.aiDate = aiDate;
    }

    public String getAiParentCode() {
        return aiParentCode;
    }

    public void setAiParentCode(String aiParentCode) {
        this.aiParentCode = aiParentCode == null ? null : aiParentCode.trim();
    }

    public String getAbCode() {
        return abCode;
    }

    public void setAbCode(String abCode) {
        this.abCode = abCode == null ? null : abCode.trim();
    }
}