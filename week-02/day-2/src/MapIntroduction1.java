import java.nio.charset.Charset;
import java.util.HashMap;

public class MapIntroduction1 {

  public static void main(String[] args) {
    // Create an empty map where the keys are integers and the values are characters
    HashMap<Integer, Character> map = new HashMap<>();

    // Print out whether the map is empty or not
    if (map.size() > 0) {
      System.out.println("The map isn't empty.");
    } else {
      System.out.println("The map is empty.");
    }

    // Add the following key-value pairs to the map
    map.put(97, 'a');
    map.put(98, 'b');
    map.put(99, 'c');
    map.put(65, 'A');
    map.put(66, 'B');
    map.put(67, 'C');

    // Print all the keys
    System.out.println(map.keySet());

    // Print all the values
    System.out.println(map.values());

    // Add value D with the key 68
    map.put(68, 'D');

    // Print how many key-value pairs are in the map
    System.out.println(map.size());

    // Print the value that is associated with key 99
    System.out.println(map.get(99));

    // Remove the key-value pair where with key 97
    map.remove(97);

    // Print whether there is an associated value with key 100 or not
    if (map.get(100) == null) {
      System.out.println("There is no value associated with key 100.");
    } else {
      System.out.println(map.get(100));
    }

    // Remove all the key-value pairs
    map.clear();
  }
}
