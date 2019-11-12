package com.x4dd3w.backendapi.models;

import java.util.List;

public class ArrayHandlerListResult {

  private List<Integer> result;

  public ArrayHandlerListResult() {

  }

  public ArrayHandlerListResult(List<Integer> result) {
    this.result = result;
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
