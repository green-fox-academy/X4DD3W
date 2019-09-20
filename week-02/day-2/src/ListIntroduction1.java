import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {
    public static void main(String[] args) {
        // Create an empty list which will contain names (strings)
        ArrayList<String> names = new ArrayList<>();

        // Print out the number of elements in the list
        System.out.println(names.size());       // 0

        // Add William to the list
        names.add("William");

        // Print out whether the list is empty or not
        if (names.size() > 0) {
            System.out.println("The list isn't empty.");
        } else {
            System.out.println("The list is empty.");
        }

        // Add John and Amanda to the list
        names.add("John");
        names.add("Amanda");

        // Print out the number of elements in the list
        System.out.println(names.size());       // 3

        // Print out the 3rd element
        System.out.println(names.get(2));       // Amanda

        // Iterate through the list and print out each name
        for (String i : names) {
            System.out.println(i);
        }

        // Iterate through the list and print
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        // Remove the 2nd element
        names.remove(1);                // Bye-bye, John

        // Iterate through the list in a reversed order and print out each name
        Collections.reverse(names);
        for (String i : names) {
            System.out.println(i);
        }

        // Other method, thx Vivi
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = names.size() - 1; i >= 0 ; i--) {
            reversedList.add(names.get(i));
        }
        names = reversedList;
        for (String reversedWord : names){
            System.out.println(reversedWord);
        }

        // Remove all elements
        names.clear();                          // Bye-bye, Amanda and William
    }
}