package com.x4dd3w.backendapi.models;

public class Doubling {

  private int received;
  private int result;

  public Doubling() {

  }

  public Doubling(int input) {
    this.received = input;
    this.result = input * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
