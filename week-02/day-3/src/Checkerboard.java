import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int size = 40;
    graphics.setColor(Color.BLACK);

    for (int i = 0; i < 8; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < 4; j++) {
          graphics.fillRect((j * 2 * size), (i * size), size, size);
        }
      } else {
        for (int k = 0; k < 4; k++) {
          graphics.fillRect((k * 2 * size + size), (i * size), size, size);
        }
      }
    }
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