package com.example.dao;

import com.example.bean.Operationlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Operationlogdao
        extends JpaRepository<Operationlog,Integer> {
}
