package com.x4dd3w.backendapi.models;

public class MyError {

  private String error;

  public MyError() {

  }

  public MyError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
