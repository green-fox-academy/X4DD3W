package com.x4dd3w.backendapi.services;

import java.util.ArrayList;
import java.util.List;

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

  @Override
  public int sumArray(List<Integer> listToSum) {
    int result = 0;
    for (int i = 0; i < listToSum.size(); i++) {
      result += listToSum.get(i);
    }
    return result;
  }

  @Override
  public int multiplyArray(List<Integer> listToMultiply) {
    int result = 1;
    for (int i = 1; i < listToMultiply.size(); i++) {
      result *= listToMultiply.get(i);
    }
    return result;
  }

  @Override
  public List<Integer> doubleArray(List<Integer> listToDouble) {
    List<Integer> result = new ArrayList<>();
    for (Integer integer : listToDouble) {
      result.add(integer * 2);
    }
    return result;
  }
}
