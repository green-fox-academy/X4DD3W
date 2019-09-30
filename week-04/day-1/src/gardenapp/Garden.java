package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> addList = new ArrayList<>();

  public Garden() {
  }

  public List findThirstyPlants() {
    List<Plant> listOfThirstyPlants = new ArrayList<>();
    for (int i = 0; i < addList.size(); i++) {
      if (addList.get(i).needsWater() == true) {
        listOfThirstyPlants.add(addList.get(i));
      }
    }
    return listOfThirstyPlants;
  }

  public void watering(double waterAmount) {
    List<Plant> saveList = findThirstyPlants();
    double waterPerPlant = waterAmount / saveList.size();
    for (int i = 0; i < saveList.size(); i++) {
      saveList.get(i).absorbing(waterPerPlant);
    }
    System.out.println("Watering " + (int) waterAmount);
  }

  public void status() {
    for (int i = 0; i < addList.size(); i++) {
      addList.get(i).statusReporter();
    }
    System.out.println();
  }

}




