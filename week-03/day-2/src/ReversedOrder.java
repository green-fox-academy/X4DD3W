import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    String toDecrypt = "reversed-order.txt";
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

    for (int i = zenOfPy.size() - 1; i > 0; i--) {
      for (int j = 0; j < zenOfPy.get(i).length(); j++) {
        temp = temp + zenOfPy.get(i).charAt(j);
      }
      decryptedFile.add(temp);
      temp = "";
    }
    return decryptedFile;
  }
}