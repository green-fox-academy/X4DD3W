import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

  public static void main(String[] args) {

    // Write a function, that takes a string as an argument and returns
    // a dictionary with all letters in the string as keys,
    // and numbers as values that shows how many occurrences there are.
    // Create a test for that.

    String example = "alma";
    System.out.println(counter(example));

  }

  public static HashMap counter(String word) {
    HashMap<Object, Integer> dictionary = new HashMap<>();
    ArrayList<Object> charToKey = new ArrayList<>(Arrays.asList(word.split("")));
    ArrayList<Integer> intToValue = new ArrayList<>();
    // thx Vivi & Mr Endoscope for the inspiration
    String[] tempArray = (word.split(""));
    Arrays.sort(tempArray);

    for (int i = 0; i < charToKey.size(); i++) {
      int occurence = 0;
      for (int j = 0; j < charToKey.size(); j++) {
        if (charToKey.get(i).equals(tempArray[j])) {
          occurence++;
        }
      }
      intToValue.add(occurence);
    }

    for (
        int i = 0; i < charToKey.size(); i++) {
      dictionary.put(charToKey.get(i), intToValue.get(i));
    }
    return dictionary;
  }
}
