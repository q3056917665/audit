package com.example.dao;

import com.example.bean.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Folderdao
        extends JpaRepository<Folder,Integer> {
}
