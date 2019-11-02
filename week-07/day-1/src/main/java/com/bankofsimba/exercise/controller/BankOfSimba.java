package com.bankofsimba.exercise.controller;

import com.bankofsimba.exercise.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankOfSimba {

  List<BankAccount> accounts = new ArrayList<>();

  public BankOfSimba() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, true));
    accounts.add(new BankAccount("Nala", 1999, "lion"));
    accounts.add(new BankAccount("Sarabi", 10000, "lion"));
    accounts.add(new BankAccount("Zazu", 78, "bird"));
    accounts.add(new BankAccount("Ed", -400, "hyena", false, false));
  }

  @GetMapping("/show")
  public String fieldsOfBankAccount(Model model) {
    model.addAttribute("accounts", accounts);
    return "index";
  }

  @GetMapping("/text")
  public String testHTML(Model model) {
    model.addAttribute("text", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "text";
  }

  @PostMapping("/raise")
  public String raisingBalance(@RequestParam int animalIndex) {
    if (accounts.get(animalIndex).getKing()) {
      double newBal = accounts.get(animalIndex).getBalance() + 100;
      accounts.get(animalIndex).setBalance(newBal);
    } else {
      double newBal = accounts.get(animalIndex).getBalance() + 10;
      accounts.get(animalIndex).setBalance(newBal);
    }
    return "redirect:/show";
  }

  // Adding a new account isn't work yet (only balance works)...
  @GetMapping("/signup")
  public String createNewAccount(@ModelAttribute("newAccount") BankAccount newAcc, Model model) {
    model.addAttribute("newAccount", newAcc);
    return "signup";
  }

  @PostMapping("/signup")
  public String registerAccount(@ModelAttribute("newAccount") BankAccount newAcc) {
    accounts.add(newAcc);
    return "redirect:/show";
  }
}
