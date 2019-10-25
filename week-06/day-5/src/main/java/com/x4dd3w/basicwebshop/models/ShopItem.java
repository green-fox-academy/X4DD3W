package com.x4dd3w.basicwebshop.models;

public class ShopItem {

  private String name;
  private String description;
  private Integer price;
  private int quantityOfStock;

  public ShopItem(String name, String description, Integer price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

}
