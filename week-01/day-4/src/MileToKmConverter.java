import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner dist1 = new Scanner(System.in);
        System.out.println("Please, give me the miles: ");
        double mile = dist1.nextDouble();
        double km = mile * 1.61;
        System.out.println(mile + " mile(s) = " + (float)km + " kilometers.");
    }
}