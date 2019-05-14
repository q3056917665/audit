package com.example.dao;

import com.example.bean.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Moduledao
        extends JpaRepository<Module,Integer> {
}
