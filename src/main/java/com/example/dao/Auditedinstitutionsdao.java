package com.example.dao;

import com.example.bean.Auditedinstitutions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Auditedinstitutionsdao
        extends JpaRepository<Auditedinstitutions,String> {
}
