import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {

  public static void main(String[] args) {

    // Create a list with the following items
    ArrayList<String> list = new ArrayList<>(
        Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

    // Create an application which solves the following problems
    //  - Do we have milk on the list?
    //  - Do we have bananas on the list?

    Scanner finder = new Scanner(System.in);
    System.out.println("What are you looking for?");
    String searchThis = finder.nextLine();
    hunter(list, searchThis);

  }

  public static void hunter(ArrayList<String> where, String what) {
    if (where.contains(what)) {
      System.out.println("Yes, we have " + what + " on the list :)");
    } else {
      System.out.println("No, we have no " + what + " on the list :(");
    }
  }
}