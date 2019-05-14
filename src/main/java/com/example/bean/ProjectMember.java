package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "project_meberae4")
public class ProjectMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pmId;

    @OneToOne(cascade = CascadeType.ALL,targetEntity = Project.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Project.class)
    @JoinColumn(name = "proId",referencedColumnName = "proId")
    private Project project;

    private Integer pmIdentity;

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public Integer getPmIdentity() {
        return pmIdentity;
    }

    public void setPmIdentity(Integer pmIdentity) {
        this.pmIdentity = pmIdentity;
    }

    public ProjectMember(Integer pmId,User user, Project project, Integer pmIdentity) {
        this.pmId=pmId;
        this.user = user;
        this.project = project;
        this.pmIdentity = pmIdentity;
    }

    public ProjectMember(User user, Project project, Integer pmIdentity) {
        this.user = user;
        this.project = project;
        this.pmIdentity = pmIdentity;
    }

    public ProjectMember() {
    }

    @Override
    public String toString() {
        return "ProjectMember{" +
                "pmId=" + pmId +
                ", user=" + user +
                ", project=" + project +
                ", pmIdentity=" + pmIdentity +
                '}';
    }
}