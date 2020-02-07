import javax.swing.*;

class Example_02 {
    public static void main(String[] args) {
        int option;

        do {
            option = JOptionPane.showConfirmDialog(null, "Do you want to  continue?", "Title Here", JOptionPane.YES_NO_OPTION);
        }
        while (option == 0);

        JOptionPane.showMessageDialog(null, "Bye!", "Title Here",  JOptionPane.INFORMATION_MESSAGE);
    }
}