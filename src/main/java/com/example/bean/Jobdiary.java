package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "jobdiary")
public class Jobdiary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jdCode;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = Project.class)
    @JoinColumn(name = "proId",referencedColumnName = "proId")
    private Project project;

    private Date workDate;

    private String jdContext;

    private String jdQuestion;

    private String jdMatter;

    private String jdPlan;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User user;

    private Date submitDate;

    public Integer getJdCode() {
        return jdCode;
    }

    public void setJdCode(Integer jdCode) {
        this.jdCode = jdCode;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public String getJdContext() {
        return jdContext;
    }

    public void setJdContext(String jdContext) {
        this.jdContext = jdContext == null ? null : jdContext.trim();
    }

    public String getJdQuestion() {
        return jdQuestion;
    }

    public void setJdQuestion(String jdQuestion) {
        this.jdQuestion = jdQuestion == null ? null : jdQuestion.trim();
    }

    public String getJdMatter() {
        return jdMatter;
    }

    public void setJdMatter(String jdMatter) {
        this.jdMatter = jdMatter == null ? null : jdMatter.trim();
    }

    public String getJdPlan() {
        return jdPlan;
    }

    public void setJdPlan(String jdPlan) {
        this.jdPlan = jdPlan == null ? null : jdPlan.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    @Override
    public String toString() {
        return "Jobdiary{" +
                "jdCode=" + jdCode +
                ", project=" + project +
                ", workDate=" + workDate +
                ", jdContext='" + jdContext + '\'' +
                ", jdQuestion='" + jdQuestion + '\'' +
                ", jdMatter='" + jdMatter + '\'' +
                ", jdPlan='" + jdPlan + '\'' +
                ", user=" + user +
                ", submitDate=" + submitDate +
                '}';
    }

    public Jobdiary(Integer jdCode,Project project, Date workDate, String jdContext, String jdQuestion, String jdMatter, String jdPlan, User user, Date submitDate) {
        this.project = project;
        this.workDate = workDate;
        this.jdContext = jdContext;
        this.jdQuestion = jdQuestion;
        this.jdMatter = jdMatter;
        this.jdPlan = jdPlan;
        this.user = user;
        this.submitDate = submitDate;
    }

    public Jobdiary(Project project, Date workDate, String jdContext, String jdQuestion, String jdMatter, String jdPlan, User user, Date submitDate) {
        this.project = project;
        this.workDate = workDate;
        this.jdContext = jdContext;
        this.jdQuestion = jdQuestion;
        this.jdMatter = jdMatter;
        this.jdPlan = jdPlan;
        this.user = user;
        this.submitDate = submitDate;
    }

    public Jobdiary() {
    }
}