import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner valami = new Scanner(System.in);
        System.out.println("Please, give me two integers:");
        int INT_1 = valami.nextInt();
        int INT_2 = valami.nextInt();
        int legs = (INT_1 * 2) + (INT_2 * 4);

        System.out.println("The farmer has " + INT_1 + " chicken and " + INT_2 + " pigs.");
        System.out.println("They have " + legs + " total!");

    }
}