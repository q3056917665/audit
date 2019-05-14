package com.example.dao;

import com.example.bean.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Newsdao extends JpaRepository<News,Integer> {
}
