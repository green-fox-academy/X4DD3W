import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number. It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these integers like:
        // Sum: 22, Average: 4.4

        Scanner input = new Scanner(System.in);
        System.out.println("Please add a number:");
        int x = input.nextInt();
        int y = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("Please enter " + (x - i) + " more integers:");  // This row is optional
            int z = input.nextInt();
            y = y + z;
        }
        System.out.println("Sum: " + y + ", Average: " + (y / x));
    }
}