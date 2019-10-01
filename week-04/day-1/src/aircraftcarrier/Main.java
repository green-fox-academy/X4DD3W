package aircraftcarrier;

public class Main {

  public static void main(String[] args) {

    Carrier carrierOne = new Carrier(2300, 5000);

    carrierOne.add(4);

    Carrier carrierTwo = new Carrier(3000, 4200);

    carrierTwo.add(3);

    carrierOne.getStatus();
    carrierTwo.getStatus();

    carrierOne.fill();
    carrierTwo.fill();

    carrierOne.getStatus();
    carrierTwo.getStatus();

    carrierOne.fight(carrierTwo);

    carrierOne.getStatus();
    carrierTwo.getStatus();

  }

}
