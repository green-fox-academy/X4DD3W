package com.x4dd3w.basicwebshop.controllers;

import com.x4dd3w.basicwebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Webshop {
  private List<ShopItem> listOfItems = new ArrayList<>();

  public Webshop() {
    listOfItems.add(new ShopItem("item1", "desc", "500", 0));
    listOfItems.add(new ShopItem("item2", "desc2", "1000", 4));
  }

  @GetMapping(value ="/webshop")
  public String itemList(Model model) {
    model.addAttribute("list", listOfItems);
    return "weeebshooop";
  }

  @GetMapping(value ="/only-available")
  public String onlyAvailable(Model model) {
    List<ShopItem> onlyAvailable = listOfItems.stream()
        .filter(item -> item.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("list", onlyAvailable);
    return "weeebshooop";
  }


}
