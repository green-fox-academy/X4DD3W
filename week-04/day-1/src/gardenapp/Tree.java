package gardenapp;

public class Tree extends Plant {

  public Tree(String name) {
    super.thirsty = 0;
    super.name = name;
    this.type = "Tree";
  }

  // 4.3.2 It shows that the Tree needs water or not
  @Override
  public boolean needsWater() {
    return thirsty < 10;
  }

  @Override
  public void absorbing(double getWater) {
    thirsty = getWater * 0.4;
  }

}
