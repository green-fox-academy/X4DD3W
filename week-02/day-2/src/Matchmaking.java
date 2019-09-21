import java.util.*;

public class Matchmaking {

  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<>(
        Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<>(
        Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff", "David"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // If someone has no pair, he/she should be the element of the list too
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static String makingMatches(ArrayList<String> g, ArrayList<String> b) {
    for (int i = 0; i < g.size() + ((b.size() - g.size())); i++) {
      if (i >= g.size()) {
        System.out.print(b.get(i) + ", ");
      } else {
        System.out.print(g.get(i) + ", ");
        System.out.print(b.get(i) + ", ");
      }
    }
    return "";
  }
}