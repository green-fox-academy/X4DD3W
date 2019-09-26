import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String toDecrypt = "duplicated-chars.txt";
    overWriter(toDecrypt);

  }

  private static void overWriter(String doubledText) {
    try {
      Path filepath = Paths.get(doubledText);
      if (Files.exists(filepath)) {
        List finalFile = decryptor(doubledText);
        Files.write(filepath, finalFile);
        System.out.println("Decryption was successful!");
      }
    } catch (IOException e) {
      System.out.println("Unable to handle the file.");
    }
  }

  private static List decryptor(String duplicated) throws IOException {
    List<String> zenOfPython = Files
        .readAllLines(Paths.get(duplicated));  // it works only with "throws IOEXception, WHY?"
    List<String> decryptedFile = new ArrayList<>();
    String decryptedTemp = "";

    for (int i = 0; i < zenOfPython.size(); i++) {
      for (int j = 0; j < zenOfPython.get(i).length(); j += 2) {
        decryptedTemp = decryptedTemp + zenOfPython.get(i).charAt(j);
      }
      decryptedFile.add(decryptedTemp);
      decryptedTemp = "";
    }
    return decryptedFile;
  }
}