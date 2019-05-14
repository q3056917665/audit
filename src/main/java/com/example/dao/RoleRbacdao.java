package com.example.dao;

import com.example.bean.RoleRbac;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRbacdao
        extends JpaRepository<RoleRbac,Integer> {
}
