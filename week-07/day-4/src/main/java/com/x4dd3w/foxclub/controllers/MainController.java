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

  @GetMapping({"/", ""})
  public String simplePage(@RequestParam(name = "name", required = false) String name,
      Model model) {

    Fox fox = new Fox(name);
    listOfFoxes.add(fox);
    model.addAttribute("name", fox.getName());
    model.addAttribute("numberofTricks", fox.getTricks().size());
    model.addAttribute("trickList", fox.getTricks());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("foxList", listOfFoxes);
    return (name == null) ? "login" : "index";
  }

  @GetMapping("/login")
  public String logIn() {
    return "login";
  }

  @PostMapping("/login")
  public String create(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/create")
  public String createForm(@ModelAttribute("fox") Fox fox) {
    return "create";
  }

  @PostMapping("/create")
  public String createFox(@ModelAttribute("fox") Fox fox) {
    listOfFoxes.add(fox);
    return "redirect:/?name=" + fox.getName();
  }
}
