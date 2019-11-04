package com.x4dd3w.foxclub.controllers;

import com.x4dd3w.foxclub.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
  @Autowired
  MainService mainservice;

  @GetMapping(value = "/nutritionStore")
  public String changeNutrition(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "nutritionStore";
  }

  @PostMapping(value = "/nutritionStore")
  public String saveNewNutrition(@RequestParam String food, @RequestParam String drink,
      @RequestParam String name) {
    mainservice.findFox(name).setFood(food);
    mainservice.findFox(name).setDrink(drink);
    return "redirect:/?name=" + name;
  }

  @GetMapping(value = "/trickCenter")
  public String goToTrickCenter(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "trickCenter";
  }

  @PostMapping(value = "/trickCenter")
  public String saveTheTrick(@RequestParam String trick, @RequestParam String name) {
    // mainservice.findFox(name).setFood(food);
    // trick checking in the list - which list? :D
    return "redirect:/?name=" + name;
  }

}
