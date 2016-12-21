package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zsuzska on 2016. 12. 20..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @RequestMapping(value = {"/", "/list"})
    public String todo(Model model){
        model.addAttribute("todos", todoService.getTodos());
        return "todo/todo";
    }


    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
}
