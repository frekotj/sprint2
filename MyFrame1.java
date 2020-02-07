import javax.swing.*;
import java.awt.*;

class MyFrame1 extends JFrame {

    MyFrame1() {
        setSize(480, 320);
        setTitle("My Frame Title");
        getContentPane().setLayout(new FlowLayout());
        JTextField myTextfield =  new JTextField(30);
        getContentPane().add(myTextfield);
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        FlowLayout flLeft = new FlowLayout(FlowLayout.LEFT);
        JPanel pnl = new JPanel(flLeft);
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        pnl.add(btn4);
        pnl.add(btn5);

        setContentPane(pnl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame1();
    }
}
