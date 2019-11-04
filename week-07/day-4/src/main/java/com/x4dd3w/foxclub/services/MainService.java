package com.x4dd3w.foxclub.services;

import com.x4dd3w.foxclub.models.Fox;

public interface MainService {

  void addFox(Fox fox);
  Fox findFox(String name);
  boolean alreadyExist(Fox fox);
}
