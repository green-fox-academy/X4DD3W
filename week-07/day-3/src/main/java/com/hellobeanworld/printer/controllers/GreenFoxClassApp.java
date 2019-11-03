package com.hellobeanworld.printer.controllers;

import com.hellobeanworld.printer.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxClassApp {

  StudentService sService;

  public GreenFoxClassApp(StudentService sService) {
    this.sService = sService;
  }

  @GetMapping("/gfa")
  public String listOfAllStudents(Model model) {
    model.addAttribute("listOfAllStudents", sService);
    return "allStudents";
  }

  @GetMapping("/gfa/list")
  public String listOfAllStudentsUnordered(Model model) {
    model.addAttribute("listOfAllStudents", sService);
    return "unorderedList";
  }

  @GetMapping("/gfa/add")
  public String addStudent() {
    return "add";
  }

  @PostMapping("/gfa/save")
  public String saveStudent(@RequestParam String newStudentName) {
    sService.save(newStudentName);
    return "redirect:/gfa";
  }

  @GetMapping("/gfa/check")
  public String studentChecker() {
    return "studentChecker";
  }

  @PostMapping("gfa/check")
  public String studentCheckerResult(String checkedStudent, Model model) {
    if (sService.findAll().contains(checkedStudent)) {
      model.addAttribute("result", checkedStudent + " is on the list.");
    } else {
      model.addAttribute("result", checkedStudent + " in not yet on the list.");
    }
    return "checkResult";
  }
}
