package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "news")
@Entity
public class News implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer newsId;

    private String newsName;

    private String newsContent;

    private Integer typeId;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "senderCode",referencedColumnName = "userCode")
    private User senderCode;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    @JoinColumn(name = "userCode",referencedColumnName = "userCode")
    private User userCode;

    private Date sendDate;

    private Integer isRead;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName == null ? null : newsName.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public User getSenderCode() {
        return senderCode;
    }

    public void setSenderCode(User senderCode) {
        this.senderCode = senderCode;
    }

    public User getUserCode() {
        return userCode;
    }

    public void setUserCode(User userCode) {
        this.userCode = userCode;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public News(Integer newsId,String newsName, String newsContent, Integer typeId, User senderCode, User userCode, Date sendDate, Integer isRead) {
        this.newsId=newsId;
        this.newsName = newsName;
        this.newsContent = newsContent;
        this.typeId = typeId;
        this.senderCode = senderCode;
        this.userCode = userCode;
        this.sendDate = sendDate;
        this.isRead = isRead;
    }

    public News(String newsName, String newsContent, Integer typeId, User senderCode, User userCode, Date sendDate, Integer isRead) {
        this.newsName = newsName;
        this.newsContent = newsContent;
        this.typeId = typeId;
        this.senderCode = senderCode;
        this.userCode = userCode;
        this.sendDate = sendDate;
        this.isRead = isRead;
    }

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", newsName='" + newsName + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", typeId=" + typeId +
                ", senderCode=" + senderCode +
                ", userCode=" + userCode +
                ", sendDate=" + sendDate +
                ", isRead=" + isRead +
                '}';
    }
}