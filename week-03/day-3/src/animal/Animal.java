package animal;

public class Animal {

  int hunger = 50;
  int thirst = 50;

  public Animal() {
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
