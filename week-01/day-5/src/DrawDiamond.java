import java.util.Scanner;

public class DrawDiamond {

  public static void main(String[] args) {
    // region Description
    // Write a program that reads a number from the standard input, then draws a diamond like this:
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    // The diamond should have as many lines as the number was
    // endregion

    Scanner pyr = new Scanner(System.in);
    System.out.println("Please add a number:");
    int num = pyr.nextInt();                  // If num = 4 -->

    for (int i = 0; i < num; i++) {           // 4x (0,1,2,3)
      for (int j = 0; j < num - i; j++) {     // 4x i0 (0,1,2,3), i1 (0,1,2), i2 (0,1), i3 (0)
        System.out.print(" ");
      }
      for (int k = 0; k <= i * 2; k++) {      // 4x i0 (0), i1 (0,1,2), i2 (0,1,2,3,4), i3 (0,1,2,3,4,5,6,7)
        System.out.print("*");
      }
      System.out.println();                          // 4x
    }
    for (int i = 0; i < num - 1; i++) {             // 3x (0,1,2)
      System.out.print(" ");
      for (int j = 0; j <= i ; j++) {               // 3x i0 (0) i1 (0,1), i2 (0,1,2)
        System.out.print(" ");
      }
      for (int k = 0; k <= num - (i * 2); k++) {    // 3x i0 (0,1,2,3,4) i1 (0,1,2) i2 (0)
        System.out.print("*");
      }
      System.out.println();
    }
  }
}