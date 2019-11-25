package com.groot.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TranslatedToGroot {

  private String received;
  private String translated = "I am Groot!";

  public TranslatedToGroot() {

  }

  public TranslatedToGroot(String received) {
    this.received = received;
    this.translated = "I am Groot!";
  }
}
