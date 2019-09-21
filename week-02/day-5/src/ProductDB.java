import java.util.HashMap;

public class ProductDB {

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

    // How much is the fish?
    System.out.println("The fish is " + item.get("Fish") + " dollars, OMG!");

    // What is the most expensive product?
    int expensive = 0;
    String expProd = "";
    for (String i : item.keySet()) {
      if (expensive < item.get(i)) {
        expensive = (item.get(i));
      }
      if (item.get(i).equals(expensive)) {
        expProd = i;
      }
    }
    System.out.println(
        "The most expensive product is the " + expProd + " and it costs " + expensive + ".");

    // What is the average price?
    int avg = 0;
    for (String i : item.keySet()) {
      avg = avg + (item.get(i));
    }
    System.out.println("The average price is " + avg + ".");

    // How many products' price is below 300?
    int below = 0;
    for (String i : item.keySet()) {
      if (item.get(i) < 300) {
        below += 1;
      }
    }
    System.out.println(below + " products' price is below 300.");

    // Is there anything we can buy for exactly 125?
    int exactly = 0;
    for (String i : item.keySet()) {
      if (item.get(i) == 125) {
        exactly = item.get(i);
      }
    }
    if (exactly == 125) {
      System.out.println("Yes, you can buy something for 125.");
    } else {
      System.out.println("No, you can't buy nothing for 125.");
    }

    // What is the cheapest product?
    int cheap = 1000000000;   // Is it cheat? :P
    String cheapProd = "";
    for (String i : item.keySet()) {
      if (cheap > item.get(i)) {
        cheap = (item.get(i));
      }
      if (item.get(i).equals(cheap)) {
        cheapProd = i;
      }
    }
    System.out.println(
        "The cheapest product is the " + cheapProd + " and it costs " + cheap + ".");

  }
}

