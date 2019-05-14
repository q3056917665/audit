package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;

    private String proName;

    private Integer proType;

    private String aiCode;

    private Date aiStartDate;

    private Date aiEndDate;

    private Date implementStratDate;

    private Date implementEndDate;

    private Integer proStage;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Plan.class)
    @JoinColumn(name = "planId",referencedColumnName = "planId")
    private Plan plan;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProType() {
        return proType;
    }

    public void setProType(Integer proType) {
        this.proType = proType;
    }

    public String getAiCode() {
        return aiCode;
    }

    public void setAiCode(String aiCode) {
        this.aiCode = aiCode == null ? null : aiCode.trim();
    }

    public Date getAiStartDate() {
        return aiStartDate;
    }

    public void setAiStartDate(Date aiStartDate) {
        this.aiStartDate = aiStartDate;
    }

    public Date getAiEndDate() {
        return aiEndDate;
    }

    public void setAiEndDate(Date aiEndDate) {
        this.aiEndDate = aiEndDate;
    }

    public Date getImplementStratDate() {
        return implementStratDate;
    }

    public void setImplementStratDate(Date implementStratDate) {
        this.implementStratDate = implementStratDate;
    }

    public Date getImplementEndDate() {
        return implementEndDate;
    }

    public void setImplementEndDate(Date implementEndDate) {
        this.implementEndDate = implementEndDate;
    }

    public Integer getProStage() {
        return proStage;
    }

    public void setProStage(Integer proStage) {
        this.proStage = proStage;
    }

    public Project(Integer proId,String proName, Integer proType, String aiCode, Date aiStartDate, Date aiEndDate, Date implementStratDate, Date implementEndDate, Integer proStage, User user, Plan plan) {
        this.proId=proId;
        this.proName = proName;
        this.proType = proType;
        this.aiCode = aiCode;
        this.aiStartDate = aiStartDate;
        this.aiEndDate = aiEndDate;
        this.implementStratDate = implementStratDate;
        this.implementEndDate = implementEndDate;
        this.proStage = proStage;
        this.user = user;
        this.plan = plan;
    }

    public Project(String proName, Integer proType, String aiCode, Date aiStartDate, Date aiEndDate, Date implementStratDate, Date implementEndDate, Integer proStage, User user, Plan plan) {
        this.proName = proName;
        this.proType = proType;
        this.aiCode = aiCode;
        this.aiStartDate = aiStartDate;
        this.aiEndDate = aiEndDate;
        this.implementStratDate = implementStratDate;
        this.implementEndDate = implementEndDate;
        this.proStage = proStage;
        this.user = user;
        this.plan = plan;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proType=" + proType +
                ", aiCode='" + aiCode + '\'' +
                ", aiStartDate=" + aiStartDate +
                ", aiEndDate=" + aiEndDate +
                ", implementStratDate=" + implementStratDate +
                ", implementEndDate=" + implementEndDate +
                ", proStage=" + proStage +
                ", user=" + user +
                ", plan=" + plan +
                '}';
    }
}