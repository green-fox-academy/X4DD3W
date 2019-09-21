public class WSStringMethods {

  public static void main(String[] args) {
    // Workshop 2019.09.17

    // Delete the whitespaces before and after the first and last words
    String lol = "    lolol  al o l o lo l      ";
    lol.trim();
    System.out.println(lol.trim());

    // Get the last character of the longest word from the string
    String sentence = "This is the longest sentence I have ever seen.";
    String[] words = sentence.split(" ");
    String longest = "";

    for (String word : words) {
      if (word.length() > longest.length()) {
        longest = word;
      }
    }
    System.out.println(longest.charAt(longest.length() - 1));
  }
}
