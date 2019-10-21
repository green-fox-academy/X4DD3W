import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercises {

  public static void main(String[] args) {

    List<Integer> tempResult;

    // Write a Stream Expression to get the even numbers from the list:
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    tempResult = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
    System.out.println("Exercise 1: " + tempResult);

    // Write a Stream Expression to get the squared value of the positive numbers from the list:
    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    tempResult = numbers2.stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .collect(Collectors.toList());
    System.out.println("Exercise 2: " + tempResult);

    // Write a Stream Expression to find which number squared value is more then 20 from the list:
    List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
    tempResult = numbers3.stream()
        .filter(n -> (n * n) > 20)
        .collect(Collectors.toList());
    System.out.println("Exercise 3: " + tempResult);

    // Write a Stream Expression to get the average value of the odd numbers from the list:
    List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    // Method #1
    double result41 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt((n) -> n)
        .summaryStatistics()
        .getAverage();
    System.out.println("Exercise 4: " + (float) result41);
    // Method #2
    OptionalDouble result42 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average();
    System.out.println("Exercise 4: " + result42);

    // Write a Stream Expression to get the sum of the odd numbers in the list:
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    // Method #1
    double result51 = numbers5.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt((n) -> n)
        .summaryStatistics()
        .getSum();
    System.out.println("Exercise 5: " + (int) result51);
    // Method #2
    int result52 = numbers5.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .sum();
    System.out.println("Exercise 5: " + result52);

    // Write a Stream Expression to find the uppercase characters in a string!
    String example = "Egyszer volt, Hol nem volt, Volt egyszer egy Kislegény...";

    char[] array = example.toCharArray();
    List<Character> result = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      result.add(i, array[i]);
    }

    System.out.println(result.stream()
      .filter(Character::isUpperCase)
        .collect(Collectors.toList()));

  }
}



















