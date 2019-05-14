package com.example.dao;

import com.example.bean.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobdao
        extends JpaRepository<Job,Integer> {
}
