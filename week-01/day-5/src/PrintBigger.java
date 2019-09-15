import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner(System.in);
        System.out.println("Please, give me two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}