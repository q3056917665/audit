package com.example.dao;

import com.example.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Roledao extends JpaRepository<Role,Integer> {
}
