import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner animals = new Scanner(System.in);
        System.out.println("Please, give me two integers:");
        int chicken = animals.nextInt();
        int pig = animals.nextInt();
        int legs = (chicken * 2) + (pig * 4);

        System.out.println("The farmer has " + chicken + " chicken(s) and " + pig + " pig(s).");
        System.out.println("They have " + legs + " legs total!");

    }
}