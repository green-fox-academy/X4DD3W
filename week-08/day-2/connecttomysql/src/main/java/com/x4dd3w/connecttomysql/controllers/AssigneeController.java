package com.x4dd3w.connecttomysql.controllers;

import com.x4dd3w.connecttomysql.models.Assignee;
import com.x4dd3w.connecttomysql.repositories.AssigneeRepository;
import com.x4dd3w.connecttomysql.services.AssigneeService;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  @Autowired
  private AssigneeRepository assigneerepository;

  @Autowired
  private AssigneeService assigneeService;

  @GetMapping("/assignees")
  public String showAssignees(Model model, @ModelAttribute(name = "assignee") Assignee assignee) {
    model.addAttribute("assignees", assigneerepository.findAll());
    return "assignees";
  }

  @PostMapping("/assigneeslist")
  public String saveAssignees(@ModelAttribute(name = "assignee") Assignee assignee) {
    assigneerepository.save(assignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/deleteAssignee")
  public String deleteAssignee(@PathVariable Long id) {
    assigneerepository.findById(id).get().getTodos().stream().forEach(todo -> todo.setAssignee(null));
    assigneerepository.deleteById(id);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/editAssignee")
  public String editAssignee(@PathVariable Long id, Model model) {
    model.addAttribute("assignee", assigneeService.findById(id));
    return "editAssignee";
  }

  @PostMapping("/{id}/editAssignee")
  public String returnTodoList(@ModelAttribute Assignee assignee) {
    assigneerepository.save(assignee);
    return "redirect:/todo/assignees";
  }

  @GetMapping("/{id}/assigneeToDos")
  public String assigneesTodos(@PathVariable Long id, Model model) {
    model.addAttribute("todos", assigneerepository.findById(id).get().getTodos().stream().collect(
        Collectors.toList()));
    return "todolist";
  }
}