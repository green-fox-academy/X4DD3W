import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fox {

  private String name;
  private String color;
  private int age;

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {
    Fox fox1 = new Fox("Lacica", "green", 4);
    Fox fox2 = new Fox("Gergoe", "white", 8);
    Fox fox3 = new Fox("David", "green", 1);
    Fox fox4 = new Fox("Adam", "purple", 8);
    Fox fox5 = new Fox("Viki", "green", 5);

    // Write a Stream Expression to find the foxes with green color!
    List<Fox> family = new ArrayList<>(Arrays.asList(fox1, fox2, fox3, fox4, fox5));
    List<String> greenFoxes = family.stream()
        .filter(fox -> fox.color.equals("green"))
        .map(fox -> fox.name)
        .collect(Collectors.toList());
    System.out.println(greenFoxes);

    // Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    List<Fox> family2 = new ArrayList<>(Arrays.asList(fox1, fox2, fox3, fox4, fox5));
    List<String> greenFoxesLessThen5Years = family.stream()
        .filter(fox -> fox.color.equals("green"))
        .filter(fox -> fox.age < 5)
        .map(fox -> fox.name)
        .collect(Collectors.toList());
    System.out.println(greenFoxesLessThen5Years);

    // Write a Stream Expression to find the frequency of foxes by color!
    List<Fox> family3 = new ArrayList<>(Arrays.asList(fox1, fox2, fox3, fox4, fox5));
    Stream<String> onlyColorsWithStream = family3.stream()
        .map(fox -> fox.color);
    Map<Object, Long> result10 = onlyColorsWithStream.collect(Collectors.groupingBy(f -> f, Collectors.counting()));
    System.out.println(result10);

  }

}
