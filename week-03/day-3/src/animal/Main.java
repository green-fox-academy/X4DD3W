package animal;

public class Main {

  public static void main(String[] args) {

    Animal dog = new Animal();
    Animal cat = new Animal();

    dog.eat();
    cat.play();

    Farm farm = new Farm();

    farm.list.add(dog);
    farm.list.add(cat);

    farm.breed();

    farm.slaughter();

  }
}
