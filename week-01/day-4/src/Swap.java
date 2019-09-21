public class Swap {

  public static void main(String[] args) {
    int a = 123;
    int b = 526;

    System.out.println("Before swap, a = " + a);
    System.out.println("Before swap, b = " + b);

    int c = a;
    a = b;
    b = c;

    System.out.println("After swap, a = " + a);
    System.out.println("After swap, b = " + b);
  }
}
