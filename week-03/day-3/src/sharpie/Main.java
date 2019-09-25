package sharpie;

public class Main {

  public static void main(String[] args) {
    Sharpie peter = new Sharpie("blue",5.0f);
    peter.use();
    // System.out.println(peter.inkAmount);   // It should be 99.0
  }

}
