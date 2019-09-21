import java.util.Scanner;

public class DrawTriangle {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a triangle
    // The triangle should have as many lines as the number was

    Scanner triangle = new Scanner(System.in);
    System.out.println("Please add a number:");
    int num = triangle.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
