package com.example.bean;

import java.util.Date;

public class Matter {
    private Integer matterId;

    private String matterName;

    private String matterType;

    private Integer typeId;

    private Date sendDate;

    private String sendCode;

    private String handleCode;

    private Integer isAgree;

    private String handleOpinion;

    public Integer getMatterId() {
        return matterId;
    }

    public void setMatterId(Integer matterId) {
        this.matterId = matterId;
    }

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName == null ? null : matterName.trim();
    }

    public String getMatterType() {
        return matterType;
    }

    public void setMatterType(String matterType) {
        this.matterType = matterType == null ? null : matterType.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode == null ? null : sendCode.trim();
    }

    public String getHandleCode() {
        return handleCode;
    }

    public void setHandleCode(String handleCode) {
        this.handleCode = handleCode == null ? null : handleCode.trim();
    }

    public Integer getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(Integer isAgree) {
        this.isAgree = isAgree;
    }

    public String getHandleOpinion() {
        return handleOpinion;
    }

    public void setHandleOpinion(String handleOpinion) {
        this.handleOpinion = handleOpinion == null ? null : handleOpinion.trim();
    }
}