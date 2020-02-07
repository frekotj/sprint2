import javax.swing.*;

class MyWindow extends JWindow {

    MyWindow() {
        setSize(480, 320);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}