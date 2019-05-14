package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projectauditor")
public class Projectauditor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paId;

    @OneToOne(fetch = FetchType.LAZY,targetEntity =User.class)
    @JoinColumn(name = "userCode",referencedColumnName ="userCode")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Project.class)
    @JoinColumn(name = "proId",referencedColumnName = "proId")
    private Project project;

    private Integer paIdentity;

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Integer getPaIdentity() {
        return paIdentity;
    }

    public void setPaIdentity(Integer paIdentity) {
        this.paIdentity = paIdentity;
    }

    public Projectauditor(Integer paId,User user, Project project, Integer paIdentity) {
        this.paId=paId;
        this.user = user;
        this.project = project;
        this.paIdentity = paIdentity;
    }

    public Projectauditor(User user, Project project, Integer paIdentity) {
        this.user = user;
        this.project = project;
        this.paIdentity = paIdentity;
    }

    public Projectauditor() {
    }
}