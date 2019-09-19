import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlay {
    public static void mainDraw(Graphics prism) {

        prism.setColor(new Color(0x4C0A50));
        for (int i = 0; i < WIDTH; i++) {
            int x = 20;
            prism.drawLine( x * i, 0, WIDTH, x * i);
        }
            /* w: weight, h: height
            10, 0, w, 10
            20, 0, w, 20
            ...
            w, 0, w, h
            */
        prism.setColor(new Color(0x318E07));
         for (int i = 0; i < HEIGHT; i++) {
            int y = 20;
            prism.drawLine(0, y * i, y * i, HEIGHT);
            /* w: weight, h: height
            0, 10, 10, h
            0, 20, 20, h
            ...
            0, h, w, h
            */
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