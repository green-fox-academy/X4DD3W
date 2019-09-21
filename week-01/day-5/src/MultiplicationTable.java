import java.util.Scanner;

public class MultiplicationTable {

  public static void main(String[] args) {
    // Create a program that asks for a number and prints the multiplication table with that number

    Scanner multi = new Scanner(System.in);
    System.out.println("Please, give me a number: ");
    int a = multi.nextInt();

    int b;

    for (int i = 1; i < 11; i++) {
      b = a * i;
      System.out.println(i + " * " + a + " = " + b);
    }
  }
}
