import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // Create a function that draws a single line and takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int a = 0;
    center(a, graphics);

  }

  public static void center(int a, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    for (int i = 0; i < WIDTH; i = i + 20) {
      graphics.drawLine(i, a, (WIDTH / 2), (HEIGHT / 2));
      graphics.drawLine(a, i, (WIDTH / 2), (HEIGHT / 2));
      graphics.drawLine(WIDTH, i, (WIDTH / 2), (HEIGHT / 2));
      graphics.drawLine(i, HEIGHT, (WIDTH / 2), (HEIGHT / 2));
    }
  }

  // region Don't touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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