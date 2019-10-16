import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt

    String toDecrypt = "reversed-lines.txt";
    overWriter(toDecrypt);

  }

  private static void overWriter(String reversedText) {
    try {
      Path filepath = Paths.get(reversedText);
      if (Files.exists(filepath)) {
        List finalFile = decryptor(reversedText);
        Files.write(filepath, finalFile);
        System.out.println("Decryption was successful!");
      }
    } catch (IOException e) {
      System.out.println("Unable to handle the file.");
    }
  }

  private static List decryptor(String reversed) throws IOException {
    List<String> zenOfPy = Files.readAllLines(Paths.get(reversed));
    List<String> decryptedFile = new ArrayList<>();
    String temp = "";

    for (int i = 0; i < zenOfPy.size(); i++) {
      for (int j = 1; j <= zenOfPy.get(i).length(); j++) {
        temp += zenOfPy.get(i).charAt(zenOfPy.get(i).length() - j);
      }
      decryptedFile.add(temp);
      temp = "";
    }
    return decryptedFile;
  }
}