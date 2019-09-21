public class Reverse {

  public static void main(String... args) {
    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(rev1(reversed));
    System.out.println(rev2(reversed));

  }

  public static String rev1(String original) {
    StringBuilder one = new StringBuilder(original);
    return one.reverse().toString();
  }

  public static String rev2(String original) {
    String[] reverse = new String[original.length()];

    for (int i = 0; i < original.length(); i++) {
      reverse[i] = String.valueOf(original.charAt(original.length() - 1 - i));
    }

    for (int j = 0; j < reverse.length; j++) {
      System.out.print(reverse[j]);
    }
    return "";  // LOL!
  }
}