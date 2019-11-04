package com.x4dd3w.foxclub.services;

import com.x4dd3w.foxclub.models.Fox;
import java.util.List;

public interface MainService {

  void addFox(Fox fox);

  Fox findFox(String name);

  boolean alreadyExist(Fox fox);

  boolean findTrick(String name, String trick);

  List<String> getTrickList();

  List<String> findTrickListElement(String name);
}
