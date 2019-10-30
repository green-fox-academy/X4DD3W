package com.hellobeanworld.printer.models;

import com.hellobeanworld.printer.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("purple")
public class PurpleColor implements MyColor {

  Printer printer;

  @Autowired
  public PurpleColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("Printer's log in PurpleColor");
  }
}
