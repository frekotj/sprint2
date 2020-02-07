import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class MyFrame extends JFrame {
    TextField myTextfield;

    MyFrame() {
        setSize(480, 320);
        setTitle("My Frame Title");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Name: "));
        myTextfield = new TextField(30);
        getContentPane().add(myTextfield);
        JButton myButton = new JButton("Click me!");
        myButton.addActionListener(this::actionPerformed);
        getContentPane().add(myButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }

    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Hello! "  + myTextfield.getText(), "Title Here", JOptionPane.INFORMATION_MESSAGE);
    }
}