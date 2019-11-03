package com.x4dd3w.foxclub.controllers;

import com.x4dd3w.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  List<Fox> listOfFoxes = new ArrayList<>();

  @GetMapping(value = {"", "/"})
  public String index(Model model, @RequestParam(name = "name", required = false) String name) {
    Fox actualfox = new Fox("anonymus", "grass", "milk");
    for (Fox fox : listOfFoxes) {
      if (fox.getName().equals(name)) {
        actualfox = fox;
      }
    }
    if (name == null) {
      return "login";
    } else {
      model.addAttribute("name", actualfox.getName());
      model.addAttribute("food", actualfox.getFood());
      model.addAttribute("drink", actualfox.getDrink());
      model.addAttribute("numberOfTricks", actualfox.getTricks().size());
      model.addAttribute("trickList", actualfox.getTricks());
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
    listOfFoxes.add(fox);
    return "redirect:/?name=" + fox.getName();
  }
}