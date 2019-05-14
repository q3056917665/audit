package com.example.dao;

import com.example.bean.Knowledgebase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Knowledgebasedao
        extends JpaRepository<Knowledgebase,String> {
}
