package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/puffygreeting")
  public String greeting(Model model) {
    model.addAttribute("name", " Puffy");
    return "puffy";
  }

}
