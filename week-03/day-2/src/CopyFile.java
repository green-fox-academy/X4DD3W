import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String fileFrom = "my-file.txt";
    String fileTo = "my-file2.txt";
    System.out.println(mimikri(fileFrom, fileTo));

  }

  private static boolean mimikri(String copyFrom, String copyTo) {
    try {
      List<String> lines = Files.readAllLines(Paths.get(copyFrom));
      Files.write(Paths.get(copyTo), lines);
      return true;
    } catch (IOException e) {
      System.out.println("Ooops! Unable to copy!");
    }
    return false;
  }

}
