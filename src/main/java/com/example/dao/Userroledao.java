package com.example.dao;

import com.example.bean.Userrole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userroledao
        extends JpaRepository<Userrole,Integer> {
}
