package com.example.javapractice.TODOList.controller;


import com.example.javapractice.TODOList.entity.Todo;
import com.example.javapractice.TODOList.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;
    public TodoController(TodoService theTodoService){
        todoService = theTodoService;
    }

    @GetMapping("/list")
    public String listTodos(Model theModel){

        // get todos from the db
        List<Todo> todos = todoService.findAll();

        // add that to the spring model
        theModel.addAttribute("todos",todos);

        return "todos/list-todos";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        Todo theTodo = new Todo();

        theModel.addAttribute("todo",theTodo);

        return "todos/todo-form";
    }

    @PostMapping("/save")
    public String saveTodo(@ModelAttribute("Todo")Todo theTodo){

        todoService.save(theTodo);

        return "redirect:/todos/list";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("todoId")int theId, Model theModel){

        Todo theTodo = todoService.findById(theId);

        theModel.addAttribute("todo",theTodo);

        return "todos/todo-form";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("todoId") int theId){

        todoService.deleteById(theId);

        return "redirect:/todos/list";
    }
}
