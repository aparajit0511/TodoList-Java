package com.example.javapractice.TODOList.rest;

import com.example.javapractice.TODOList.entity.Todo;
import com.example.javapractice.TODOList.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoRestController {

    private TodoService todoService;

    @Autowired
    public TodoRestController(TodoService theTodoService){
        todoService = theTodoService;
    }

    @GetMapping("/todos")
    public List<Todo> findAll(){
        return todoService.findAll();
    }

}
