import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter two words:");
    String input = scanner.next();
    String input2 = scanner.next();

    // Print out "true", if the two words has the same characters, or "false", if not.
    boolean isItAnAnagram = anagram(input, input2);
    System.out.println(isItAnAnagram);

  }

  public static boolean anagram(String temp1, String temp2) {
    // Convert input strings to string array
    String[] tempArray1 = (temp1.split(""));
    String[] tempArray2 = (temp2.split(""));

    // Sort tempArrays
    Arrays.sort(tempArray1);
    Arrays.sort(tempArray2);

    // Compare the elements of inputs
    if (Arrays.equals(tempArray1, tempArray2)) {
      return true;
    }
    return false;
  }
}
