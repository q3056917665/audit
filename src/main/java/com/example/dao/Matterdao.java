package com.example.dao;

import com.example.bean.Matter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Matterdao extends JpaRepository<Matter,Integer> {
}
