public class SumDigits {

  public static void main(String[] args) {
    //  Given a non-negative integer n, return the sum of its digits recursively (without loops).
    //  Hint
    //  Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //  Java, C++, C#, Python
    //  Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    System.out.println(sumDigit(4447));

  }

  public static int sumDigit(int n) {
    if (n <= 9) {
      return n;
    } else {
      return n % 10 + sumDigit(n / 10);
    }
  }
}
