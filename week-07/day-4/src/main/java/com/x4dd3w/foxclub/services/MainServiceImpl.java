package com.x4dd3w.foxclub.services;

import com.x4dd3w.foxclub.models.Fox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

  private static final Fox DEFAULT_FOX = new Fox();
  private static final List<Fox> FOXES = new ArrayList<>();
  private static final List<String> trickList = new ArrayList<>(
      Arrays.asList("Trick1", "Trick2", "Trick3"));

  @Override
  public List<String> getTrickList() {
    return trickList;
  }

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
  public boolean alreadyExist(Fox foxToCheck) {
    boolean exist = false;
    for (Fox fox : FOXES) {
      if (fox.getName().equals(foxToCheck.getName())) {
        exist = true;
      }
    }
    return exist;
  }

  @Override
  public boolean findTrick(String name, String trick) {
    boolean exist = false;
    if (findFox(name).getTricks().contains(trick)) {
      exist = true;
    }
    return exist;
  }

  @Override
  public List<String> findTrickListElement(String name) {
    List<String> tricksOfFox = findFox(name).getTricks();
    List<String> trickList = getTrickList();
    trickList.removeAll(tricksOfFox);
    return trickList;
  }
}