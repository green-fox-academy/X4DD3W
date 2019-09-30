package gardenapp;

public class Flower extends Plant {

  public Flower(String name) {
    super.thirsty = 0;
    super.name = name;
    this.type = "Flower";
  }

  // 4.3.1 It shows that the Flower needs water or not
  @Override
  public boolean needsWater() {
    return thirsty < 5;
  }

  @Override
  public void absorbing(double getWater) {
    thirsty = getWater * 0.75;
  }

}