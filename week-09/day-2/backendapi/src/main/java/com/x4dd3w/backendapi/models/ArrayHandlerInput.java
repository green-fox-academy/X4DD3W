package com.x4dd3w.backendapi.models;

import java.util.List;

public class ArrayHandlerInput {

  private String what;
  private List<Integer> numbers;

  public ArrayHandlerInput() {

  }

  public ArrayHandlerInput(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }
}
