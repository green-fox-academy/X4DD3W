package petrolstation;

public class Car {

  int gasAmount;
  int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public static void main(String[] args) {

    Car peugeot = new Car();
    Station mol = new Station();

    mol.refill(peugeot);
    System.out.println(mol.gasAmount);
    System.out.println(peugeot.gasAmount);

  }

}
