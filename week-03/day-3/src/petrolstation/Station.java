package petrolstation;

public class Station {

  int gasAmount = 500;

  public void refill(Car auto) {
    this.gasAmount = this.gasAmount - (auto.capacity);
    auto.gasAmount = auto.capacity;
  }

}
