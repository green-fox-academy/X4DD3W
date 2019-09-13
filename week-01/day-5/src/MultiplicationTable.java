import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number: ");
        int a = scanner.nextInt();

        int b;

        for (int i = 1; i < 11; i++) {
            b = a * i;
            System.out.println(i + " * " + a + " = " + b);
        }
    }
}
