import java.util.Scanner;

public class DrawSquare {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a square like this:
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    // The square should have as many lines as the number was

    Scanner diagonal = new Scanner(System.in);
    System.out.println("Please add a number:");
    int num = diagonal.nextInt();
    int space = num - 2;

    for (int i = 0; i < num - space; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print("% ");
      }
      if (i > 0) {
        break;
      }
      System.out.println();
      for (int k = 0; k < space; k++) {
        System.out.print("% ");
        for (int l = 0; l < space; l++) {
          if (k == l) {
            System.out.print("  ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println("%");
      }
    }
  }
}
