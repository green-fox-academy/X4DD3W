package sharpie;

public class Main {

  public static void main(String[] args) {
    Sharpie first = new Sharpie("blue", 5.0f);
    Sharpie second = new Sharpie("yellow", 4.2f);

    for (int i = 0; i < 100; i++) {
      first.use();
    }

    SharpieSet moreSharpie = new SharpieSet();
    moreSharpie.list.add(0, first);
    moreSharpie.list.add(1, second);

    System.out.println(second.inkAmount);
    System.out.println(moreSharpie.countUsable(second));
    System.out.println(first.inkAmount);
    System.out.println(moreSharpie.countUsable(first));

    moreSharpie.removeTrash();

  }
}
