package com.hellobeanworld.printer.controllers;

import com.hellobeanworld.printer.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {

  UtilityService util;

  @Autowired
  public UsefulUtilities(UtilityService util) {
    this.util = util;
  }

  @GetMapping("/useful")
  public String linkPresenter() {
    System.out.println("haha");
    return "index";
  }

  @GetMapping("/colored")
  public String backgroundColorer(UtilityService util, Model model) {
    model.addAttribute("randomColor", util.randomColor());
    return "coloredbackground";
  }

  @PostMapping("/email")
  public String emailValidator(@RequestParam String email, Model model) {
    boolean isValid = util.validateEmail(email);
    if (isValid) {
      model.addAttribute("email", email + " is a valid email address");
    } else {
      model.addAttribute("email", email + " is not a valid email address");
    }
    model.addAttribute("isValid", isValid);
    return "email";
  }

  @PostMapping("/caesar")
  public String encoding(Model model, @RequestParam String toEncrypt, @RequestParam int numberToEncrypt) {
    model.addAttribute("result", util.caesar(toEncrypt, numberToEncrypt));
    return "caesar";
  }

  @PostMapping("/caesar/decrypt")
  public String decoding(Model model, @RequestParam String toDecrypt, @RequestParam int numberToDecrypt) {
    model.addAttribute("result", util.caesar(toDecrypt, -numberToDecrypt));
    return "caesar";
  }
}
