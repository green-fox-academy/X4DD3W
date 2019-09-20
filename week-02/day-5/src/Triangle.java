import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class Triangle {
    public static void mainDraw(Graphics triangle) {

        int x = 10;      // WIDTH and HEIGHT must be dividable with x
        triangle.setColor(new Color(0x318E07));

        for (int i = 0; i < HEIGHT / 2; i = i + x) {
            triangle.drawLine((WIDTH / 2) + i, 2 * i, 2 * i, HEIGHT);
        }

        for (int i = 0; i < HEIGHT / 2; i = i + x) {
            triangle.drawLine((WIDTH / 2) - i, 2 * i, WIDTH - (2 * i), HEIGHT);
        }

        for (int i = 0; i <= HEIGHT / 2; i = i + x) {
            triangle.drawLine((WIDTH / 2) - i, 2 * i, (WIDTH / 2) + i, 2 * i);
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