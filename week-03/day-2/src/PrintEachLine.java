import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each line from the file.
    // If the program is unable to read the file (for example it does not exist),
    // then it should print the following error message: "Unable to read file: my-file.txt"

    try {
      Path filepath = Paths.get("my-file.txt");  // The file is in the project's base folder
      List<String> allLines = Files.readAllLines(filepath);
      System.out.println(allLines);
    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}