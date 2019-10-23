package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloToTheWorld {

  // Create a web app which says hello in different languages.
  // Use the @RequestParam annotation to have different font sizes and colors.

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  private String[] colors = {"blue", "red", "purple", "grey", "yellow", "black", "green", "cyan"};
  private Random random = new Random();

  @RequestMapping (value = "/helloToTheWorld")
  public String greetingToTheWorld(/*@RequestParam String color, @RequestParam int fontsize,*/ Model model) {
    int fontsize = random.nextInt(200);
    String color = colors[random.nextInt(colors.length)];
    model.addAttribute("colorToHTML", "color: " + color);
    model.addAttribute("sizeToHTML", "font-size: " + fontsize + "px");
    model.addAttribute("languageToHTML", hellos[random.nextInt(hellos.length)]);
    return "greetingToTheWorld";
  }

}
