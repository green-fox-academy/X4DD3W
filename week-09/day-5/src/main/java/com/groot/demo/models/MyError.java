package com.groot.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyError {

  private String error;

  public MyError() {
  }

  public MyError(String error) {
    this.error = error;
  }
}
