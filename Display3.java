import javax.swing.*;
import java.awt.*;

class Display3 extends JFrame {

    int WIDTH = 500;
    int HEIGHT = 500;
    int X_POS = (WIDTH / 2) - 150;
    int Y_POS = (HEIGHT / 2) - 150;

    public Display3() {
        super("Rectangle 300 x 300");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(X_POS, Y_POS, 300, 300);
        g.setColor(Color.BLUE);
    }

    public static void main(String[] args) {
        Display3 display = new Display3();
    }
}