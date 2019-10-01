package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
  }

  public Violin(int numberOfStrings) {
    super.numberOfStrings = 4;
    System.out.print(name + ", a " + numberOfStrings + "-stringed instrument that goes " );
    sound();
  }

  @Override
  public void play() {
    System.out.println("Screech");
  }
}
