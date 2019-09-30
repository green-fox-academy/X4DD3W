package gardenapp;

public class Flower extends Plant {

  public Flower(String name) {
    super.thirsty = 0;
    super.name = name;
    this.type = "Flower";
  }

  @Override
  public boolean needsWater() {
    return thirsty < 5;
  }

  @Override
  public void absorbing(double getWater) {
    thirsty = getWater * 0.75;
  }

}