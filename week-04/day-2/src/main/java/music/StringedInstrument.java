package main.java.music;

public abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;

  public void sound() {
    play();
  }

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument(String name, int numberOfStrings){
    super.name = name;
    this.numberOfStrings = numberOfStrings;
    sound();
  }
}
