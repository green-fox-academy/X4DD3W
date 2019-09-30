package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> garden = new ArrayList<>();

  public Garden() {
  }

  // 5.2 It creates a new arraylist and add every thirsty Flower/Trees
  // from the Garden to the list (see needswater() in Plant class)
  public List findThirstyPlants() {
    List<Plant> listOfThirstyPlants = new ArrayList<>();
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i).needsWater() == true) {
        listOfThirstyPlants.add(garden.get(i));
      }
    }
    return listOfThirstyPlants;
  }

  // 5.1 It creates a new arraylist for Plants from the thirsty Plants
  // with findThirstyPlants() method (see above)

  // Then creates a new double for the amount of water per plant.
  //
  // After that, its go through the arraylist
  // and gives this waterPerPlant every thirsty Flower/Tree.

  // absorbing(double) sets the Flower/Tree's thirsty equal to waterPerPlant
  // (see Plant class)
  public void watering(double waterAmount) {
    List<Plant> saveList = findThirstyPlants();
    double waterPerPlant = waterAmount / saveList.size();
    for (int i = 0; i < saveList.size(); i++) {
      saveList.get(i).absorbing(waterPerPlant);
    }
    System.out.println("Watering " + (int) waterAmount);
  }

  // 4.1 Go through the arraylist and run the Plant's statusReporter()
  // method (see Plant class)
  public void status() {
    for (int i = 0; i < garden.size(); i++) {
      garden.get(i).statusReporter();
    }
    System.out.println();
  }

}




