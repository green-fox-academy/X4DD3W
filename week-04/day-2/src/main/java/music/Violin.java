package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    super(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    System.out.print(name + "Violin, a " + numberOfStrings + "-stringed instrument that goes " );
    sound();
  }

  @Override
  public void play() {
    System.out.println("Screech");
  }
}
