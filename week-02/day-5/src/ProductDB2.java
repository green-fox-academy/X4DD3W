import java.util.HashMap;

public class ProductDB2 {

  public static void main(String[] args) {

    // region Create a map with the following key-value pairs:
    HashMap<String, Integer> item = new HashMap<>();
    item.put("Eggs", 200);
    item.put("Milk", 200);
    item.put("Fish", 400);
    item.put("Apples", 150);
    item.put("Bread", 50);
    item.put("Chicken", 550);
    // endregion

    // Which products cost less than 201? (just the name)
    for (String i : item.keySet()) {
      if (item.get(i) < 201) {
        System.out.print(i + " ");
      }
    }
    System.out.println();

    // Which products cost more than 150? (name + price)
    for (String i : item.keySet()) {
      if (item.get(i) > 150) {
        System.out.println(i + "(" + item.get(i) + ")");
      }
    }
  }
}