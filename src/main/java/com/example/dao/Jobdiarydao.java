package com.example.dao;

import com.example.bean.Jobdiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Jobdiarydao
        extends JpaRepository<Jobdiary,Integer> {
}
