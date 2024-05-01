package com.example.javapractice.TODOList.service;

import com.example.javapractice.TODOList.dao.TodoRepository;
import com.example.javapractice.TODOList.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Todo save(Todo theTodo){
        return todoRepository.save(theTodo);
    }

    @Override
    public Todo findById(int theId){
        Optional<Todo> result = todoRepository.findById(theId);

        Todo theTodo = null;

        if(result.isPresent()){
            theTodo = result.get();
        }
        else{
            throw new RuntimeException("Did not find id - " + theId);
        }

        return theTodo;

    }

    @Override
    public void deleteById(int theId){
        todoRepository.deleteById(theId);
    }
}
