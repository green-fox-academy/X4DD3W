import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class StarryNight {
    public static void mainDraw(Graphics star) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        star.setColor(Color.BLACK);
        star.fillRect(0, 0, WIDTH, HEIGHT);
        for (int i = 0; i < 200; i++) {
            squareDrawer(star);
        }
    }

    public static void squareDrawer(Graphics color) {
        int x = greyRandomizer(0);
        color.setColor(new Color(x, x, x));
        color.fillRect(sizeRandomizer(0), sizeRandomizer(0), 10, 10);
    }

    public static int greyRandomizer(int rgb) {
            return (int)(Math.random() * 256);
    }

    public static int sizeRandomizer(int rgb) {
        return (int)(Math.random() * WIDTH);
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