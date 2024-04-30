package com.example.javapractice.TODOList.service;

import com.example.javapractice.TODOList.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();

    Todo save(Todo theTodo);
}
