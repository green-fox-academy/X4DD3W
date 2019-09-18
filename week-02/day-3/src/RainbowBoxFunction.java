import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        // This is optional, it operates with the size of the squares
        Scanner input = new Scanner(System.in);
        System.out.println("Please add me an integer between 10 and 25!");
        int x = input.nextInt();
        squareDrawer(x, graphics);

        }

    public static void squareDrawer(int number, Graphics color) {
        for (int j = 0; j < 7; j++) {
            color.setColor(new Color(colorRandomizer(0), colorRandomizer(0), colorRandomizer(0)));
            color.fillRect((j * number), (j * number), (WIDTH - (j * (number * 2))), (HEIGHT - (j * (number * 2))));
        }
    }

    public static int colorRandomizer(int rgb) {
        return (int)(Math.random() * 256);
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