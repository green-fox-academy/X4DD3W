package gardenapp;

public class Main {

  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellowF = new Flower("yellow");
    Plant blueF = new Flower("blue");

    Plant purpleTree = new Tree("purple");
    Plant orangeTree = new Tree("orange");

    myGarden.addList.add(yellowF);
    myGarden.addList.add(blueF);
    myGarden.addList.add(purpleTree);
    myGarden.addList.add(orangeTree);

    myGarden.status();

    myGarden.watering(40);
    myGarden.status();

    myGarden.watering(70);
    myGarden.status();

  }

}
