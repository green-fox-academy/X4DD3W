public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;

        System.out.println("A csere előtt a = " + a);
        System.out.println("A csere előtt b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("A csere után a = " + a);
        System.out.println("A csere után b = " + b);
    }
}
