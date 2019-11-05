package com.x4dd3w.tododatabase.controllers;

import com.x4dd3w.tododatabase.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  private ToDoRepository repository;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
}