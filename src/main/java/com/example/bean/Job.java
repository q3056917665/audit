package com.example.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "job")
public class Job implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobId;

    @OneToOne(fetch = FetchType.LAZY,targetEntity = PsSystemconfig.class)
    @JoinColumn(name = "psId",referencedColumnName = "psId")
    private PsSystemconfig psSystemconfig;

    private String jobName;

    private String jobCode;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public PsSystemconfig getPsSystemconfig() {
        return psSystemconfig;
    }

    public void setPsSystemconfig(PsSystemconfig psSystemconfig) {
        this.psSystemconfig = psSystemconfig;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", psSystemconfig=" + psSystemconfig +
                ", jobName='" + jobName + '\'' +
                ", jobCode='" + jobCode + '\'' +
                '}';
    }

    public Job(Integer jobId,PsSystemconfig psSystemconfig, String jobName, String jobCode) {
        this.jobId=jobId;
        this.psSystemconfig = psSystemconfig;
        this.jobName = jobName;
        this.jobCode = jobCode;
    }

    public Job(PsSystemconfig psSystemconfig, String jobName, String jobCode) {
        this.psSystemconfig = psSystemconfig;
        this.jobName = jobName;
        this.jobCode = jobCode;
    }

    public Job() {
    }
}