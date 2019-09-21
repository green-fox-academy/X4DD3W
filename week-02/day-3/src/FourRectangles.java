import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // Draw four different size and color rectangles.
    // Avoid code duplication.

    for (int i = 0; i < 4; i++) {
      randomizer(graphics);

    }
  }

  public static void randomizer(Graphics color) {
    int x = (int) (Math.random() * (WIDTH / 2));
    int y = (int) (Math.random() * (HEIGHT / 2));
    int w = (int) (Math.random() * (WIDTH / 2));
    int h = (int) (Math.random() * (HEIGHT / 2));

    color.setColor(new Color(colorRandomizer(0), colorRandomizer(0), colorRandomizer(0)));
    color.drawRect(x, y, w, h);
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