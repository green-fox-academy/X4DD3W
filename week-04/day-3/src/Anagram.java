import java.util.Arrays;

public class Anagram {

  public boolean anagramOrNot(String firstString, String secondString) {
    // Convert input strings to string array, splits them into characters
    String[] tempArray1 = (firstString.split(""));
    String[] tempArray2 = (secondString.split(""));

    // Sort tempArrays' characters in alphabet
    Arrays.sort(tempArray1);
    Arrays.sort(tempArray2);

    // Compare the elements of inputs
    return (Arrays.equals(tempArray1, tempArray2));
  }

}
