package com.hellobeanworld.printer.controllers;

import com.hellobeanworld.printer.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilities {

  UtilityService util;

  @Autowired
  public UsefulUtilities(UtilityService util) {
    this.util = util;
  }

  @GetMapping("/useful")
  public String linkPresenter() {
    System.out.println("hehe");
    return "index";
  }

  @GetMapping("/useful/colored")
  public String backgroundColorer(UtilityService util, Model model) {
    model.addAttribute("randomColor", util.randomColor());
    return "randomPage";
  }


}
