package com.x4dd3w.backendapi.services;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

  @Override
  public int sum(int until) {
    int result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }
    return result;
  }

  @Override
  public int factor(int until) {
    int result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }
}
