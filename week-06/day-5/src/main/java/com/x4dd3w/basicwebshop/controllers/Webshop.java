package com.x4dd3w.basicwebshop.controllers;

import com.x4dd3w.basicwebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Webshop {

  private List<ShopItem> listOfItems = new ArrayList<>();

  public Webshop() {
    listOfItems.add(new ShopItem("Running shoes", "Nike running for every day sport", 500, 0));
    listOfItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 1000, 4));
    listOfItems.add(new ShopItem("Coca cola", "0.5l standard coke", 1500, 3));
    listOfItems.add(new ShopItem("Wokin", "Chicken with fired rice and WOKIN sauce", 2000, 2));
    listOfItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 5000, 3));
  }

  @GetMapping(value = "/webshop")
  public String itemList(Model model) {
    model.addAttribute("list", listOfItems);
    return "webshop";
  }

  @GetMapping(value = "/only-available")
  public String onlyAvailable(Model model) {
    List<ShopItem> onlyAvailable = listOfItems.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("list", onlyAvailable);
    return "webshop";
  }

  @GetMapping(value = "/cheapest-first")
  public String cheapestFirst(Model model) {
    List<ShopItem> cheapestFirst = listOfItems.stream()
        .sorted(Comparator.comparingInt(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("list", cheapestFirst);
    return "webshop";
  }

  @GetMapping(value = "/contains-nike")
  public String containsNike(Model model) {
    List<ShopItem> containsNike = listOfItems.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike") ||
            item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
    model.addAttribute("list", containsNike);
    return "webshop";
  }

  @GetMapping(value = "/average-stock")
  public String averageStock(Model model) {
    double average = listOfItems.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .mapToInt(n -> n.getQuantityOfStock())
        .average().getAsDouble();
    model.addAttribute("avg", "Average stock: " + average);
    return "webshop-avg";
  }

  @GetMapping(value = "/most-expensive")
  public String mostExpensive(Model model) {
    String mostExpensive = listOfItems.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .max(Comparator
        .comparingInt(ShopItem::getPrice)).get().getName();
    model.addAttribute("avg", mostExpensive);
    return "webshop-avg";
  }

  @PostMapping(value = "/search")
  public String search(Model model, @RequestParam String userInput) {
    String userInputLowerCase = userInput.toLowerCase();
    List<ShopItem> searchInName = listOfItems.stream()
        .filter(item -> item.getName().toLowerCase().contains(userInputLowerCase) ||
            item.getDescription().toLowerCase().contains(userInputLowerCase))
        .collect(Collectors.toList());
    model.addAttribute("list", searchInName);
    return "webshop";
  }
}