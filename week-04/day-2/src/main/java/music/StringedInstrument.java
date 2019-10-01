package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public void sound() {
    play();
  }

  public StringedInstrument(){

  }

  public StringedInstrument(String name, int numberOfStrings){
    super.name = name;
    this.numberOfStrings = numberOfStrings;
    sound();
  }

}
