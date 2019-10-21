import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    double result42 = numbers4.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average().getAsDouble();
    System.out.println("Exercise 4: " + (float) result42);

    // Write a Stream Expression to get the sum of the odd numbers in the list:
    List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    double result51 = numbers5.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt((n) -> n)
        .summaryStatistics()
        .getSum();
    System.out.println("Exercise 5: " + (int) result51);

    // Write a Stream Expression to find the uppercase characters in a string!
    String example = "Egyszer volt, Hol nem volt, Volt egyszer egy Kislegény...";
    List<Character> upperCaseChars = example.codePoints()
        .mapToObj(s -> (char) s)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println("Exercise 6: " + upperCaseChars);

    // Write a Stream Expression to find the strings which starts with
    // a given letter (as parameter), in the following list:
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    List<String> result7 = cities.stream()
        .filter(x -> x.startsWith("A"))
        .collect(Collectors.toList());
    System.out.println("Exercise 7: " + result7);

    // Write a Stream Expression to concatenate a Character list to a string!
    List<Character> charList2 = Arrays.asList('A', 'L', 'M', 'A');
    Stream<Character> charAsWords = charList2.stream();
    // Stream<String> list = charAsWords.map(String::valueOf);
    Stream<String> list = charAsWords.map(c -> c.toString());
    String string = list.collect(Collectors.joining());
    System.out.println("Exercise 8: " + string);

    // Write a Stream Expression to find the frequency of characters in a given string!
    // Gabor-edition
    String word = "telhetetlen";
    Map<Character, Integer> letterFrequency = new HashMap<>();
    word.chars()
        .forEach(letter -> letterFrequency
            .put((char) letter, letterFrequency.getOrDefault((char) letter, 0) + 1));
    System.out.println(letterFrequency);

  }
}
