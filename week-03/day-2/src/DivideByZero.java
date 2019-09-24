import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // Create a function that takes a number divides ten with it, and prints the result.
    // It should print "fail" if the parameter is 0.

    divider(0);

  }

  private static void divider(int divider) {
    try {
      System.out.println(10 / divider);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
