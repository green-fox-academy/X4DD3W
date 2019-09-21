public class DrawChessTable {

  public static void main(String[] args) {
    // Create a program that draws a chess table

    String row1 = "  ██  ██  ██  ██";
    String row2 = "██  ██  ██  ██  ";

    for (int i = 1; i <= 8; i++) {
      if (i % 2 == 0) {
        System.out.println(row1);
      } else {
        System.out.println(row2);
      }
    }
  }
}
