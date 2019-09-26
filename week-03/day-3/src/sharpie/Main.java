package sharpie;

public class Main {

  public static void main(String[] args) {
    Sharpie peter = new Sharpie("blue", 5.0f);
    Sharpie thomas = new Sharpie("yellow", 4.2f);

    for (int i = 0; i < 100; i++) {
      peter.use();
    }

    SharpieSet moreShark = new SharpieSet();
    moreShark.list.add(0, peter);
    moreShark.list.add(1, thomas);

    System.out.println(thomas.inkAmount);
    System.out.println(moreShark.countUsable(thomas));
    System.out.println(peter.inkAmount);
    System.out.println(moreShark.countUsable(peter));

    moreShark.removeTrash();

  }
}
