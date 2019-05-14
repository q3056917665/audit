package com.example.dao;

import com.example.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao
        extends JpaRepository<User,String> {
}
