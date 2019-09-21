import java.util.HashMap;

public class MapIntroduction2 {

  public static void main(String[] args) {
    // Create a map where the keys are strings and the values are strings with the following initial values
    HashMap<String, String> letter = new HashMap<>();
    letter.put("978-1-60309-452-8",
        "A Letter to Jo");                     // Is there a better method for this?
    letter.put("978-1-60309-459-7", "Lupus");
    letter.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    letter.put("978-1-60309-461-0", "The Lab");

    // Print all the key-value pairs in the following format
    for (String i : letter.keySet()) {
      System.out.println(letter.get(i) + (" (ISBN: ") + i + ")");
    }

    // Remove the key-value pair with key 978-1-60309-444-3
    letter.remove("978-1-60309-444-3");

    // Remove the key-value pair with value The Lab
    letter.remove(letter.get("The Lab"));

    // Add the following key-value pairs to the map
    letter.put("978-1-60309-450-4", "They Called Us Enemy");
    letter.put("978-1-60309-453-5", "Why Did We Trust Him?");

    // Print whether there is an associated value with key 478-0-61159-424-8 or not
    if (letter.equals(letter.get("478-0-61159-424-8"))) {
      System.out.println("There is a book with this ISBN.");
    } else {
      System.out.println("There is no book with this ISBN.");
    }

    // Print the value associated with key 978-1-60309-453-5
    System.out.println(letter.get("978-1-60309-453-5"));
  }
}
