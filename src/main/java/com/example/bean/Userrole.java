package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
@Table(name ="userrole")
@Entity
public class Userrole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer urId;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = User.class) //级联操作
    @JoinColumn(name = "userCode",referencedColumnName ="userCode")
    private User user;

    @OneToOne(fetch = FetchType.LAZY,targetEntity =Role.class) //级联操作
    @JoinColumn(name = "roleId",referencedColumnName = "roleId")
    private Role role;

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Userrole(Integer urId,User user, Role role) {
        this.urId=urId;
        this.user = user;
        this.role = role;
    }

    public Userrole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public Userrole() {
    }

    @Override
    public String toString() {
        return "Userrole{" +
                "urId=" + urId +
                ", user=" + user +
                ", role=" + role +
                '}';
    }
}