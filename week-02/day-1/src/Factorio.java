import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        // - Create the usual class wrapper and main method on your own.
        // - Create a function called `factorio` that returns it's input's factorial

        Scanner input = new Scanner(System.in);
        System.out.println("Please add a number, I give you back its factorial: ");

        int x = sum(input.nextInt());
        System.out.println(x);
    }
        
    public static int sum(int y) {
        int z = 1;
        for (int i = 0; i < y; i++) {
            z = z * (y - i);
        }
        return z;
    }
}