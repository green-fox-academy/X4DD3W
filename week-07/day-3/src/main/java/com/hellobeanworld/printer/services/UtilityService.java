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

  public boolean validateEmail(String email) {
    return (email.contains("@") && email.contains("."));
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}
