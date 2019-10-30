package com.hellobeanworld.printer.models;

import org.springframework.stereotype.Service;

@Service
public class BlackColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is black in color...");
  }
}
