import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {

        // Create a list with the following items
        ArrayList<Integer> moneySpent = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        // region Task description

        // Create an application which solves the following problems:
        //  - How much did we spend?                                    // 3845
        //  - Which was our greatest expense?                           // 1250
        //  - Which was our cheapest spending?                          // 120
        //  - What was the average amount of our spendings?             // ~ 640.8

        // endregion

        System.out.println("How much did we spend? " + sum(moneySpent));
        System.out.println("Which was our greatest expense? " + max(moneySpent));
        System.out.println("Which was our cheapest spending? " + min(moneySpent));
        System.out.println("What was the average amount of our spendings? " + avg(moneySpent));

    }

    public static int sum(ArrayList<Integer> firstP) {
        int result = 0;
        firstP.toArray();

        for (int i = 0; i < firstP.size(); i++) {
            result = result + firstP.get(i);
        }
        return result;
    }

    public static int max(ArrayList<Integer> secondP) {
        int maximum = secondP.get(0);

        for (int num : secondP) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    public static int min(ArrayList<Integer> thirdP) {
        int minimum = thirdP.get(0);

        for (int num : thirdP) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }

    public static float avg(ArrayList<Integer> fourthP) {
        int result = 0;
        fourthP.toArray();

        for (int i = 0; i < fourthP.size(); i++) {
            result = result + fourthP.get(i);
        }
        return result / fourthP.size();
    }
}