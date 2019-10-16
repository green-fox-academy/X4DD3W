import java.util.HashMap;

public class CountLetters {

  // Write a function, that takes a string as an argument and returns
  // a dictionary with all letters in the string as keys,
  // and numbers as values that shows how many occurrences there are.
  // Create a test for that.

  public HashMap counter(String word) {
    char[] charArray = word.toCharArray();
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < charArray.length; i++) {
      if (dictionary.containsKey(charArray[i])) {
        dictionary.put(charArray[i], dictionary.get(charArray[i]) + 1);
      } else {
        dictionary.put(charArray[i], 1);
      }
    }
    return dictionary;
  }
}
