package com.example.dao;

import com.example.bean.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projectdao
        extends JpaRepository<Project,Integer> {
}
