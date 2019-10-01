package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
  }

  public ElectricGuitar(int numberOfStrings) {
    super.numberOfStrings = 6;
    System.out.print("Electric Guitar, a " + numberOfStrings + "-stringed instrument that goes " );
    sound();
  }

  @Override
  public void play() {
    System.out.println("Twang");
  }
}
