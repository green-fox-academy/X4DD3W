package com.x4dd3w.backendapi.services;

import java.util.List;

public interface Service {

  int sum(int until);
  int factor(int until);
  int sumArray(List<Integer> listToSum);
  int multiplyArray(List<Integer> listToMultiply);
  List<Integer> doubleArray(List<Integer> listToDouble);
}
