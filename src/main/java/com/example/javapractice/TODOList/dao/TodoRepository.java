package com.example.javapractice.TODOList.dao;

import com.example.javapractice.TODOList.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer> {

}
