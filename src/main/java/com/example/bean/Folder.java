package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "folder")
public class Folder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer folderId;

    private String folderName;

    private String folderPath;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User user;

    private Date createDate;

    private String info;

    private Integer isUsable;

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath == null ? null : folderPath.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getIsUsable() {
        return isUsable;
    }

    public void setIsUsable(Integer isUsable) {
        this.isUsable = isUsable;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderId=" + folderId +
                ", folderName='" + folderName + '\'' +
                ", folderPath='" + folderPath + '\'' +
                ", user=" + user +
                ", createDate=" + createDate +
                ", info='" + info + '\'' +
                ", isUsable=" + isUsable +
                '}';
    }

    public Folder(String folderName, String folderPath, User user, Date createDate, String info, Integer isUsable) {
        this.folderName = folderName;
        this.folderPath = folderPath;
        this.user = user;
        this.createDate = createDate;
        this.info = info;
        this.isUsable = isUsable;
    }

    public Folder(Integer folderId,String folderName, String folderPath, User user, Date createDate, String info, Integer isUsable) {
        this.folderId=folderId;
        this.folderName = folderName;
        this.folderPath = folderPath;
        this.user = user;
        this.createDate = createDate;
        this.info = info;
        this.isUsable = isUsable;
    }

    public Folder() {
    }
}