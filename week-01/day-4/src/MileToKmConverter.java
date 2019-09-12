import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner tav1 = new Scanner(System.in);
        System.out.println("Please, give me the miles: ");
        double mile = tav1.nextDouble();
        double km = mile * 1.2;
        System.out.println("Your " + mile + " miles is " + km + " km.");

    }
}