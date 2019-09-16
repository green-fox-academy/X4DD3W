import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        Scanner input = new Scanner(System.in);
        System.out.println("Please add a number: ");
                                            // Ha esetleg Dia és bajtársai ez elolvasnák... :)
        int x = sum(input.nextInt());       // 1. Inputból beveszi a sum(input) értékét, aminek az eredményére MAJD "x"-ként hivatkozik!
        System.out.println(x);              // 5. Kiírja az "x" értékét
    }

    public static int sum(int y) {          // 2. "y" néven átveszi a sum(input)ban megadott értéket, és azzal dolgozik
        int z = 0;
        for (int i = 0; i < y; i++) {
            z = z + (y - i);                // 3. "y"-t használja a "z" létrehozásához
        }
        return z;                           // 4. A "z" nevű  változó értékét adja a sum(input) végső eredményének,
    }                                       // ami "x" névvel fut majd a 11-12. sorban (amikor kiírjuk az eredményt).
}
