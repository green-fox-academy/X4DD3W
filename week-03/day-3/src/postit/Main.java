package postit;

import java.awt.Color;

public class Main {

  public static void main(String[] args) {

    PostIt first = new PostIt(Color.orange, "Idea1", Color.blue);
    PostIt second = new PostIt(Color.pink, "Awesome", Color.blue);
    PostIt third = new PostIt(Color.yellow, "Superb!", Color.green);

    System.out.println(first.text);

  }
}
