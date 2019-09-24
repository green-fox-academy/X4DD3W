import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String zero = "my-file.txt";
    reader(zero);

  }

  public static void reader(String input) {
    try {
      Path filepath = Paths.get(input);
      List<String> everyLine = Files.readAllLines(filepath);
      System.out.println(everyLine.size());
    } catch (Exception e) {
      System.out.println("zero");
    }
  }
}
