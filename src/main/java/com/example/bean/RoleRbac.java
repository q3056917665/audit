package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role_rbac")
public class RoleRbac implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rrId;

    @OneToMany(
            fetch = FetchType.LAZY,
            targetEntity =Role.class,
            mappedBy = "roleId"
    )
    private List<Role> role=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL) //级联操作
    @JoinColumn(name = "moduleId",referencedColumnName = "moduleId")
    private Module module;

    public Integer getRrId() {
        return rrId;
    }

    public void setRrId(Integer rrId) {
        this.rrId = rrId;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }


    public RoleRbac(Integer rrId,List<Role> role, Module module) {
        this.rrId=rrId;
        this.role = role;
        this.module = module;
    }

    public RoleRbac(List<Role> role, Module module) {
        this.role = role;
        this.module = module;
    }

    public RoleRbac() {
    }
}