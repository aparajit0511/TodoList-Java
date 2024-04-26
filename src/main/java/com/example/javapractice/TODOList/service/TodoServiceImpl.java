package com.example.javapractice.TODOList.service;

import com.example.javapractice.TODOList.dao.TodoRepository;
import com.example.javapractice.TODOList.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository theTodoRepository){
        todoRepository = theTodoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
