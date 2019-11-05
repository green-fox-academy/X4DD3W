package com.x4dd3w.tododatabase.controllers;

import com.x4dd3w.tododatabase.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @Autowired
  private ToDoRepository repository;

  // Create a new controller called TodoController which maps to /tod0 ???
  @GetMapping("/todo")
  public String todo() {
    return "redirect:/";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
}
