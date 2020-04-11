import javax.swing.*;
import java.awt.*;

class Display2 extends JFrame {

    int WIDTH = 500;
    int HEIGHT = 500;
    int X_POS = (WIDTH / 2) - 100;
    int Y_POS = (HEIGHT / 2) - 100;

    public Display2() {
        super("Rectangle 200 x 200");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(X_POS, Y_POS, 200, 200);
        g.setColor(Color.BLUE);
    }

    public static void main(String[] args) {
        Display2 display = new Display2();
    }
}

