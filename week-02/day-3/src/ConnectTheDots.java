import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        //                  0           1           2           3
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] smg = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        graphics.setColor(new Color(0x008E03));
        dotLiner(box, graphics);
        graphics.drawLine(box[3][0], box[3][1], box[0][0], box[0][1]);
        graphics.setColor(new Color(0x920000));
        dotLiner(smg, graphics);

    }

    public static void dotLiner(int[][] x, Graphics trollo) {
        for (int i = 0; i < x.length - 1; i++) {
            trollo.drawLine(x[i][0], x[i][1], x[i + 1][0], x[i + 1][1]);
            /*   i;
            00 01 10 11;
            10 11 20 21;
            20 21 30 31;
            30 31 00 01;   */
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