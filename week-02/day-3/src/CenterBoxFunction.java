import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a function that draws one square and takes 2 parameters:
    // the square size and the graphics and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

    for (int i = 0; i < 3; i++) {
      threeSquare(graphics);
    }
  }

  public static void threeSquare(Graphics color) {
    int x = (int) (Math.random() * (WIDTH / 2));
    color.setColor(new Color(colorRandomizer(0), colorRandomizer(0), colorRandomizer(0)));
    color.drawRect(((WIDTH / 2) - (x / 2)), ((HEIGHT / 2) - (x / 2)), x, x);
  }

  public static int colorRandomizer(int rgb) {
    return (int) (Math.random() * 256);
  }

  // region Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
  // endregion
}