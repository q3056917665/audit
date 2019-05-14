package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "matter")
@Entity
public class Matter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matterId;

    private String matterName;

    private String matterType;

    private Integer typeId;

    private Date sendDate;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "sendCode",referencedColumnName = "userCode")
    private User sendCode;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "handleCode",referencedColumnName = "userCode")
    private User handleCode;

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

    public User getSendCode() {
        return sendCode;
    }

    public void setSendCode(User sendCode) {
        this.sendCode = sendCode;
    }

    public User getHandleCode() {
        return handleCode;
    }

    public void setHandleCode(User handleCode) {
        this.handleCode = handleCode;
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

    public Matter(Integer matterId,String matterName, String matterType, Integer typeId, Date sendDate, User sendCode, User handleCode, Integer isAgree, String handleOpinion) {
        this.matterId=matterId;
        this.matterName = matterName;
        this.matterType = matterType;
        this.typeId = typeId;
        this.sendDate = sendDate;
        this.sendCode = sendCode;
        this.handleCode = handleCode;
        this.isAgree = isAgree;
        this.handleOpinion = handleOpinion;
    }

    public Matter(String matterName, String matterType, Integer typeId, Date sendDate, User sendCode, User handleCode, Integer isAgree, String handleOpinion) {
        this.matterName = matterName;
        this.matterType = matterType;
        this.typeId = typeId;
        this.sendDate = sendDate;
        this.sendCode = sendCode;
        this.handleCode = handleCode;
        this.isAgree = isAgree;
        this.handleOpinion = handleOpinion;
    }

    public Matter() {
    }

    @Override
    public String toString() {
        return "Matter{" +
                "matterId=" + matterId +
                ", matterName='" + matterName + '\'' +
                ", matterType='" + matterType + '\'' +
                ", typeId=" + typeId +
                ", sendDate=" + sendDate +
                ", sendCode=" + sendCode +
                ", handleCode=" + handleCode +
                ", isAgree=" + isAgree +
                ", handleOpinion='" + handleOpinion + '\'' +
                '}';
    }
}