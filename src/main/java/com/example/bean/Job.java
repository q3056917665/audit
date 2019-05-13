package com.example.bean;

public class Job {
    private Integer jobId;

    private Integer psId;

    private String jobName;

    private String jobCode;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
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
}