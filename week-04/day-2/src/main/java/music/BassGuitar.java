package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    super(4);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    System.out.print("Bass Guitar, a " + numberOfStrings + "-stringed instrument that goes " );
    sound();
  }

  @Override
  public void play() {
    System.out.println("Duum-duum-duum");
  }
}