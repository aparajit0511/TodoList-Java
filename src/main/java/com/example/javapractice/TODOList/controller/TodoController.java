package com.example.javapractice.TODOList.controller;


import com.example.javapractice.TODOList.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;
    public TodoController(TodoService theTodoService){
        todoService = theTodoService;
    }
}
