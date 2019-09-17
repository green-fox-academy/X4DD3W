import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        // Create a list ('ListA') which contains the following values
        ArrayList<String> ListA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        // Create a new list ('ListB') with the values of ListA
        ArrayList<String> ListB = new ArrayList<>(ListA);

        // Print out whether ListA contains Durian or not
        for (String i : ListA) {
            if (i == "Durian") {
                System.out.println("Durian is on the list.");
            }
        }

        // Remove Durian from List B
        for (String j : ListB) {
            if (j == "Durian") {
                ListB.remove(j);
            }
        }

        // Add Kiwifruit to ListA after the 4th element
        ListA.add(4, "Kiwifruit");
        System.out.println(ListA);

        // Compare the size of ListA and ListB
        if (ListA.size() > ListB.size()) {
            System.out.println("ListA is bigger.");
        } else if (ListA.size() < ListB.size()) {
            System.out.println("ListB is bigger.");
        } else {
            System.out.println("ListA and ListB is equal size.");
        }

        // Get the index of Avocado from ListA
        ListA.indexOf("Avocado");
        System.out.println("Avocado's index is " + ListA.indexOf("Avocado"));

        // Get the index of Durian from ListB
        ListB.indexOf("Durian");
        System.out.println("Durian's index is " + ListB.indexOf("Durian"));     // Durian isn't on the ListB

        // Add Passion Fruit and Pomelo to ListB in a single statement
        ListB.addAll(new ArrayList<>(Arrays.asList("Passion Fruit", "Pomelo")));

        // Print out the 3rd element from ListA
        System.out.println(ListA.get(4));
    }
}

