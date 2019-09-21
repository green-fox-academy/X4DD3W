public class VariableMutation {

  public static void main(String[] args) {

    int a = 3;         // make the "a" variable's value bigger by 10
    a = a + 10;        // OR: a += 10;
    System.out.println(a);

    int b = 100;       // make b smaller by 7
    b = b - 7;         // OR: b -= 7;
    System.out.println(b);

    int c = 44;        // please double c's value
    c = c * 2;         // OR: c *= 2;
    System.out.println(c);

    int d = 125;       // please divide by 5 d's value
    d = d / 5;         // OR: d /= 5;
    System.out.println(d);

    int e = 8;         // please cube of e's value
    e = e * e * e;     // OR: e = Math.pow(e, 3); (cube = "köb")
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    boolean f = f1 > f2;
    System.out.println(f);

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    boolean g = g1 < (g2 * 2);
    System.out.println(g);

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
    boolean taskH = (h % 11 == 0);
    System.out.println(taskH);

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    boolean i = (Math.pow(i2, 3) > i1) && (i1 > (i2 * i2));
    System.out.println(i);

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    boolean taskJ = (j % (3 * 5) == 0);
    System.out.println(taskJ);
  }
}