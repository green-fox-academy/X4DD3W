package com.x4dd3w.foxclub.services;

import com.x4dd3w.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

  private static final Fox DEFAULT_FOX = new Fox();
  private static final List<Fox> FOXES = new ArrayList<>();

  @Override
  public void addFox(Fox fox) {
    FOXES.add(fox);
  }

  @Override
  public Fox findFox(String name) {
    Fox result = DEFAULT_FOX;
    for (Fox fox : FOXES) {
      if (fox.getName().equals(name)) {
        result = fox;
      }
    }
    return result;
  }

  @Override
  public boolean alreadyExist(Fox foxToCheck){
    boolean exist = false;
    for(Fox fox : FOXES){
      if (fox.getName().equals(foxToCheck.getName())){
        exist = true;
      }
    }
    return exist;
  }
}