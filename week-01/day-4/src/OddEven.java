import java.util.Scanner;

public class OddEven {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    //odd = páratlan, even = páros

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, give me an integer: ");
        int number = input.nextInt();
        if (number % 2 == 0) {  // A nulla páros.
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
