package com.x4dd3w.connecttomysql.controllers;

import com.x4dd3w.connecttomysql.models.Todo;
import com.x4dd3w.connecttomysql.repositories.AssigneeRepository;
import com.x4dd3w.connecttomysql.repositories.ToDoRepository;
import com.x4dd3w.connecttomysql.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  private ToDoRepository toDoRepository;

  @Autowired
  private AssigneeRepository assigneerepository;

  @Autowired
  private ToDoService service;

  @GetMapping({"/", "/list", ""})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", toDoRepository.findAll());
    } else {
      model.addAttribute("todos", service.showActiveToDos(isActive));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String addNewTodo(@ModelAttribute(name = "todo") Todo todo) {
    return "add";
  }

  @PostMapping("/add")
  public String saveNewTodo(@ModelAttribute(name = "todo") Todo todo) {
    toDoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable Long id) {
    toDoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable Long id, Model model) {
    model.addAttribute("todo", service.findById(id));
    model.addAttribute("assignees", assigneerepository.findAll());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String returnTodoList(@ModelAttribute(name = "todo") Todo todo, @RequestParam(name = "assigneeId", required = false) Long assigneeId) {
    todo.setAssignee(assigneerepository.findById(assigneeId).orElse(null));
    toDoRepository.save(todo);
    return "redirect:/todo/";
  }

  @PostMapping("/search")
  public String search(@RequestParam(name = "userInput") String userInput, Model model) {
    model.addAttribute("todos", service.searched(userInput));
    return "todolist";
  }
}