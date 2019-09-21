public class SubInt {

  public static void main(String[] args) {

    //  region description
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array
    //  Example:
    //  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    //  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
    // endregion

    int search = 1;
    int[] numbers = {1, 11, 34, 52, 61};

    analyzer(search, numbers);

  }

  public static String analyzer(int what, int[] where) {
    String texty[] = new String[where.length];
    for (int i = 0; i < where.length; i++) {
      texty[i] = String.valueOf(where[i]);
    }

    for (int i = 0; i < where.length; i++) {
      if (texty[i].contains(String.valueOf(what))) {
        System.out.print(i + " ");
      }
    }
    return "LOL";
  }
}