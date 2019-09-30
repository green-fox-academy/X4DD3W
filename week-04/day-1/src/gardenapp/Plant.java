package gardenapp;

public class Plant {

  double thirsty;
  String name;
  String type;

  public Plant() {

  }

  public Plant(String name) {
    this.thirsty = 0;
    this.name = name;
  }

  public boolean needsWater() {
    return true;
  }

  public void absorbing(double getWater) {
    thirsty = getWater;
  }

  public void statusReporter() {
    if (needsWater()) {
      System.out.println("The " + this.name + " " + this.type + " needs water.");
    } else {
      System.out.println("The " + this.name + " " + this.type + " doesn't need water.");
    }
  }

}
