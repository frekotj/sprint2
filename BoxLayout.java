import javax.swing.*;

class MyFrame4 extends JFrame {

    MyFrame4() {
        setSize(480, 320);
        setTitle("My Frame Title");
        // first we create three buttons
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        // then we create a panel to hold the buttons
        JPanel pnl = new JPanel();
        BoxLayout layout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
        pnl.setLayout(layout);
        // we add the three buttons to the panel
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        // finally we set the panel as the content pane of the frame
        setContentPane(pnl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame4();
    }


}
