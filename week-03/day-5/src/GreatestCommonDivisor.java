public class GreatestCommonDivisor {

  public static void main(String[] args) {

    int x = -21;
    int y = 9;
    int n = Math.max(x, y);
    System.out.println(lnko(x, y, n));
    System.out.println(adamsDivisor(-21, 9)); // Thx, Adam :P

  }

  public static int lnko(int x, int y, int n) {

    if ((x % n == 0) && (y % n == 0)) {
      return n;
    } else {
      return lnko(x, y, n - 1);
    }
  }

  public static int adamsDivisor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (Math.max(a, b) % Math.min(a, b) == 0) {
      return Math.min(a, b);
    } else {
      return adamsDivisor((Math.max(a, b) % Math.min(a, b)), Math.min(a, b));
    }
  }
}
