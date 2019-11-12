package com.x4dd3w.backendapi.models;

public class AppendA {

  private String appended;

  public AppendA() {

  }

  public AppendA(String appended) {
    this.appended = appended.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
