package com.example.dao;

import com.example.bean.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberdao extends JpaRepository<ProjectMember,Integer> {
}
