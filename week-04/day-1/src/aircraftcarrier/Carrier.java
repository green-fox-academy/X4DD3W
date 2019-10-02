package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carrier {

  List<Aircraft> carrier = new ArrayList<>();
  int ammoStorage;
  int healthPoints;
  Random random = new Random();

  public Carrier(int ammoStorage, int hp) {
    List<Aircraft> list = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.healthPoints = hp;
  }

  public void add(int howManyAircraftAdd) {
    for (int i = 0; i < howManyAircraftAdd; i++) {
      int n = random.nextInt(2);
      if (n == 0) {
        carrier.add(new F16());
      } else {
        carrier.add(new F35());
      }
    }
  }

  public void fill() {
    // If there is not enough ammo then it should start to fill the aircrafts with priority first
    try {
      if (neededAmmo() > ammoStorage) {
        for (int i = 0; i < carrier.size(); i++) {
          if (carrier.get(i).isPriority()) {
            carrier.get(i).refill(ammoStorage);
          }
        }
      } else {
        for (int i = 0; i < carrier.size(); i++) {
          carrier.get(i).refill(ammoStorage);
        }
      }
      // If there is no ammo when this method is called, it should throw an exception
    } catch (Exception e) {
      System.out.println("There is no ammo!");
    }
  }

  // It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
  public void fight(Carrier anotherCarrier) {
    int allIn = 0;
    for (int i = 0; i < this.carrier.size(); i++) {
      allIn = allIn + this.carrier.get(i).fight();
    }
    anotherCarrier.healthPoints -= allIn;
  }

  public void getStatus() {
    if (healthPoints <= 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println(
          "HP: " + healthPoints + ", Aircraft count: " + carrier.size() + ", Ammo Storage: "
              + ammoStorage + ", Total damage: " + carrierTotalDamage());
      System.out.println("Aircrafts:");
      for (int i = 0; i < carrier.size(); i++) {
        carrier.get(i).getStatus();
      }
    }
  }

  public int neededAmmo() {
    int ammoCounter = 0;
    for (int i = 0; i < carrier.size(); i++) {
      if (carrier.get(i).ammo < carrier.get(i).maxAmmo) {
        ammoCounter += (carrier.get(i).maxAmmo - carrier.get(i).ammo);
      }
    }
    return ammoCounter;
  }

  public int carrierTotalDamage() {
    int totalDamage = 0;
    for (int i = 0; i < this.carrier.size(); i++) {
      totalDamage = totalDamage + this.carrier.get(i).fight();
    }
    return totalDamage;
  }
}
