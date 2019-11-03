package com.hellobeanworld.printer;

import com.hellobeanworld.printer.models.MyColor;
import com.hellobeanworld.printer.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

  private Printer printy;
  private MyColor color;

  // Constructor
  @Autowired
  public PrinterApplication(Printer printy, @Qualifier("purple") MyColor color) {
    this.printy = printy;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(PrinterApplication.class, args);
  }

  // Override the CommandLineRunner's "run"-method
  @Override
  public void run(String... args) throws Exception {
    printy.log("Muahaha!");
    color.printColor();
  }
}
