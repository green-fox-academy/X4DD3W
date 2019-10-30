package com.hellobeanworld.printer.services;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }
}
