package gardenapp;

public class Tree extends Plant {

  public Tree(String name) {
    this.thirsty = 0;
    super.name = name;
    this.type = "Tree";
  }

  @Override
  public boolean needsWater() {
    return thirsty < 10;
  }

  @Override
  public void absorbing(double getWater) {
    thirsty = getWater * 0.4;
  }

}
