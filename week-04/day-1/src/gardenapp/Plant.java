package gardenapp;

public class Plant {

  double thirsty;
  String name;
  String type;

  public Plant() {

  }

  /*public Plant(String name) {
    this.thirsty = 0;
    this.name = name;
  }*/

  // 5.3 If the Plant needs water (its thirsty is under 5 / 10)
  // returns true
  public boolean needsWater() {
    return true;
  }

  public void absorbing(double getWater) {
    thirsty = getWater;
  }

  // 4.2 See the Plant element's needsWater() method and give back it's status:
  // It needs water or not (see Flower and Tree class)
  public void statusReporter() {
    if (needsWater()) {
      System.out.println("The " + this.name + " " + this.type + " needs water.");
    } else {
      System.out.println("The " + this.name + " " + this.type + " doesn't need water.");
    }
  }

}
