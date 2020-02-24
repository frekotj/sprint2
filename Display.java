import java.awt.*;
import javax.swing.*;

public class Display extends JFrame {

    int WIDTH = 500;
    int HEIGHT = 500;
    int X_POS = (WIDTH / 2) - 50;
    int Y_POS = (HEIGHT / 2) - 50;

    public Display(){
        super("Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(X_POS, Y_POS, 100, 100);
        g.setColor(Color.BLUE);
    }

    public static void main(String[] args){
        Display display = new Display();
    }
}
