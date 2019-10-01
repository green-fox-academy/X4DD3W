package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
  }

  public BassGuitar(int numberOfStrings) {
    super.numberOfStrings = 4;
    System.out.print("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes " );
    sound();
  }

  @Override
  public void play() {
    System.out.println("Duum-duum-duum");
  }
}