package com.x4dd3w.foxclub.controllers;

import com.x4dd3w.foxclub.models.Fox;
import com.x4dd3w.foxclub.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  private MainService mainservice;

  @GetMapping(value = {"", "/"})
  public String index(Model model, @RequestParam(name = "name", required = false) String name) {
    Fox actualfox = mainservice.findFox(name);
    if (actualfox.getName() == null) {
      return "login";
    } else {
      model.addAttribute("fox", actualfox);
      return "index";
    }
  }

  @GetMapping(value = {"/login"})
  public String logIn() {
    return "login";
  }

  @PostMapping(value = {"/login"})
  public String logIn(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping(value = {"/create"})
  public String createForm(@ModelAttribute("fox") Fox fox) {
    return "create";
  }

  @PostMapping(value = {"/create"})
  public String createFox(@ModelAttribute("fox") Fox fox) {
    mainservice.addFox(fox);
    return "redirect:/?name=" + fox.getName();
  }

  @GetMapping(value = "/nutritionStore")
  public String changeNutrition(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "nutritionStore";
  }

  @PostMapping(value = "/nutritionStore")
  public String saveNewNutrition(@RequestParam String food, @RequestParam String drink, @RequestParam String name) {
    mainservice.findFox(name).setFood(food);
    mainservice.findFox(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }
}