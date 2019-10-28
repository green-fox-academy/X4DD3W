package com.bankofsimba.exercise.model;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean goodGuy;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = false;
    this.goodGuy = true;
  }

  public BankAccount(String name, double balance, String animalType, boolean king, boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = king;
    this.goodGuy = goodGuy;
  }

  public BankAccount(){}

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }
}
