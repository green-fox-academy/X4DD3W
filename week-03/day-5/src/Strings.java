public class Strings {

  public static void main(String[] args) {

    // Given a string, compute recursively (no loops)
    // a new string where all the lowercase 'x' chars have been changed to 'y' chars.

    String text = "xerXes and Xanax xoxoXo";
    System.out.println(lowerChanger(text));


  }

  private static String lowerChanger(String what) {
    what = what.replaceAll("x", "y");
    return what;
  }
}
