package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "knowledgebase")
public class Knowledgebase implements Serializable {
    @Id
    private String kbCode;

    private String kbName;

    private String kbPath;

    private Date kbDate;

    private String kbStatus;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Knowledgebase{" +
                "kbCode='" + kbCode + '\'' +
                ", kbName='" + kbName + '\'' +
                ", kbPath='" + kbPath + '\'' +
                ", kbDate=" + kbDate +
                ", kbStatus='" + kbStatus + '\'' +
                ", user=" + user +
                '}';
    }

    public Knowledgebase(String kbCode, String kbName, String kbPath, Date kbDate, String kbStatus, User user) {
        this.kbCode = kbCode;
        this.kbName = kbName;
        this.kbPath = kbPath;
        this.kbDate = kbDate;
        this.kbStatus = kbStatus;
        this.user = user;
    }

    public Knowledgebase(String kbName, String kbPath, Date kbDate, String kbStatus, User user) {
        this.kbName = kbName;
        this.kbPath = kbPath;
        this.kbDate = kbDate;
        this.kbStatus = kbStatus;
        this.user = user;
    }

    public Knowledgebase() {
    }
}