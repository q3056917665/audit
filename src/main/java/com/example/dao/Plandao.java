package com.example.dao;

import com.example.bean.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Plandao
        extends JpaRepository<Plan,Integer> {
}
