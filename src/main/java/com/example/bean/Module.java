package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "module")
public class Module implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer moduleId;

    private String moduleName;

    private String modulePath;

    private Integer parentId;

    private String moduleIcon;

    private Integer moduleIsmenu;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath == null ? null : modulePath.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon == null ? null : moduleIcon.trim();
    }

    public Integer getModuleIsmenu() {
        return moduleIsmenu;
    }

    public void setModuleIsmenu(Integer moduleIsmenu) {
        this.moduleIsmenu = moduleIsmenu;
    }

    public Module(Integer moduleId,String moduleName, String modulePath, Integer parentId, String moduleIcon, Integer moduleIsmenu) {
        this.moduleId=moduleId;
        this.moduleName = moduleName;
        this.modulePath = modulePath;
        this.parentId = parentId;
        this.moduleIcon = moduleIcon;
        this.moduleIsmenu = moduleIsmenu;
    }

    public Module(String moduleName, String modulePath, Integer parentId, String moduleIcon, Integer moduleIsmenu) {
        this.moduleName = moduleName;
        this.modulePath = modulePath;
        this.parentId = parentId;
        this.moduleIcon = moduleIcon;
        this.moduleIsmenu = moduleIsmenu;
    }

    public Module() {
    }
}