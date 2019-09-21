import java.util.HashMap;

public class ShoppingList2 {

  public static void main(String[] args) {

    // region Represent the following products with their prices
    HashMap<String, Double> prices = new HashMap<>();
    prices.put("Milk", 1.07);
    prices.put("Rice", 1.59);
    prices.put("Eggs", 3.14);
    prices.put("Cheese", 12.60);
    prices.put("Chicken Breasts", 9.40);
    prices.put("Apples", 2.31);
    prices.put("Tomato", 2.58);
    prices.put("Potato", 1.75);
    prices.put("Onion", 1.10);
    // endregion

    // region Represent Bob's shopping list
    HashMap<String, Integer> bob = new HashMap<>();
    bob.put("Milk", 3);
    bob.put("Rice", 2);
    bob.put("Eggs", 2);
    bob.put("Cheese", 1);
    bob.put("Chicken Breasts", 4);
    bob.put("Apples", 1);
    bob.put("Tomato", 2);
    bob.put("Potato", 1);
    // endregion

    // region Represent Alice's shopping list
    HashMap<String, Integer> alice = new HashMap<>();
    alice.put("Rice", 1);
    alice.put("Eggs", 5);
    alice.put("Chicken Breasts", 2);
    alice.put("Apples", 2);
    alice.put("Tomato", 10);
    // endregion

    // How much does Bob pay?
    double sumBob = 0;
    for (String i : bob.keySet()) {
      sumBob = sumBob + (prices.get(i) * bob.get(i));
    }
    System.out.println("Bob must pay " + sumBob + ".");

    // How much does Alice pay?
    double sumAli = 0;
    for (String i : alice.keySet()) {
      sumAli = sumAli + (prices.get(i) * alice.get(i));
    }
    System.out.println("Alice must pay " + sumAli + ".");

    // Who buys more Rice?
    if (bob.get("Rice") == alice.get("Rice")) {
      System.out.println("Bob buys as many rice as Alice.");
    } else if (bob.get("Rice") > alice.get("Rice")) {
      System.out.println("Bob buys more rice.");
    } else {
      System.out.println("Alice buys more rice.");
    }

    // Who buys more Potato?
    if (alice.containsKey("Potato")) {
    } else {
      alice.put("Potato", 0);
    }
    if (bob.get("Potato") == alice.get("Potato")) {
      System.out.println("Bob buys as many potato as Alice.");
    } else if (bob.get("Potato") > alice.get("Potato")) {
      System.out.println("Bob buys more potato.");
    } else {
      System.out.println("Alice buys more potato.");
    }

    // Who buys more different products?
    if (bob.size() == alice.size()) {
      System.out.println("Bob buys as many different products as Alice.");
    } else if (bob.size() > alice.size()) {
      System.out.println("Bob buys more different products.");
    } else {
      System.out.println("Alice buys more different products.");
    }

    // Who buys more products (piece)?
    int sumB = 0;
    for (String i : bob.keySet()) {
      sumB = sumB + (bob.get(i));
    }

    int sumA = 0;
    for (String i : alice.keySet()) {
      sumA = sumA + (alice.get(i));
    }

    if (sumB > sumA) {
      System.out.println("Bob buys more piece of products.");
    } else {
      System.out.println("Alice buys more piece of products.");
    }
  }
}