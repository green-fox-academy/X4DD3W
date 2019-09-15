import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Please, give your name: ");
        String name = user.next();
        System.out.println("Hello, " + name + "!");
    }
}