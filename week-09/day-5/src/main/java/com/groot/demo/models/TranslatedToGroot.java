package com.groot.demo.models;

public class TranslatedToGroot {

  private String received;
  private String translated = "I am Groot!";

  public TranslatedToGroot() {

  }

  public TranslatedToGroot(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
