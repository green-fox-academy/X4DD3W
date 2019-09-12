public class TwoNumbers {
    public static void main(String[] args) {
        int a = 13;
        int b = 22;
        System.out.println(a + b); // 35
        System.out.println(b - a); // 9
        System.out.println(b * a); // 286
        System.out.println((float)b / (float)a); // 1.69...
        //A fenti ugyanígy, csak számokkal:
        System.out.println(22. / 13); // Hosszabb lett a kiírt szám. WHY?
        System.out.println(b / a); // 1 (mert egész számként mutatja, hányszor van meg benne
        System.out.println(b % a); // 9

    }
}
