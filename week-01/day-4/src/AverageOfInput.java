import java.util.Scanner;

public class AverageOfInput {

  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    // Sum: 22, Average: 4.4

    Scanner something = new Scanner(System.in);
    System.out.println("Please, give me five integers:");
    int a = something.nextInt();
    int b = something.nextInt();
    int c = something.nextInt();
    int d = something.nextInt();
    int e = something.nextInt();
    int sum = a + b + c + d + e;
    float avg = sum / 5;
    // It works with enter or space between integers.
    System.out.println("SUM: " + sum + ", Average: " + avg);

  }
}