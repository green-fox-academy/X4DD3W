package gardenapp;

public class Main {

  public static void main(String[] args) {
    // 1. Create a new Garden (an arraylist), which can store Plants
    // Plant (superclass) has two subclasses, Flower and Tree
    Garden myGarden = new Garden();

    // 2. Create four Plants, two Flower and two Tree
    // We must give the name, because Flower and Tree constructor also needs it
    Plant yellowF = new Flower("yellow");
    Plant blueF = new Flower("blue");

    Plant purpleT = new Tree("purple");
    Plant orangeT = new Tree("orange");

    // 3. Add the four Plants to the Garden (to the arraylist)
    myGarden.garden.add(yellowF);
    myGarden.garden.add(blueF);
    myGarden.garden.add(purpleT);
    myGarden.garden.add(orangeT);

    // 4. Run the Garden's status() method (see Garden class)
    myGarden.status();

    // 5. Run the Garden's watering() method (see Garden class)
    myGarden.watering(40);
    myGarden.status();

    myGarden.watering(70);
    myGarden.status();

  }

}
