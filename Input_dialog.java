import javax.swing.*;

class Example_03 {
    public static void main(String[] args) {
        String ageStr;
        int age;

        while (true) {
            ageStr = JOptionPane.showInputDialog(null, "How old are you?", "Age Input", JOptionPane.QUESTION_MESSAGE);

            try {
                age = Integer.parseInt(ageStr);
                if (age < 0 || age > 150)
                    throw new RuntimeException("Not a valid age!");
                break;
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Not a valid number!", "Error Dialog", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Dialog", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "You are " + age + " years old", "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
