import javax.swing.*;

public class EvenEntryLoop {
    public static void main(String args[]){
        String userNumString = JOptionPane.showInputDialog(null, "Enter an even number or 999");
        int userNum = Integer.parseInt(userNumString);
        while (userNum != 999) {

            while (userNum % 2 != 0) {
                JOptionPane.showMessageDialog(null, "Error. Not an even number", "Error Message", JOptionPane.ERROR_MESSAGE);
                userNumString = JOptionPane.showInputDialog(null, "Enter an even number or 999");
                userNum = Integer.parseInt(userNumString);
            }
                JOptionPane.showMessageDialog(null, "Good Job");
                userNumString = JOptionPane.showInputDialog(null, "Enter an even number or 999");
                userNum = Integer.parseInt(userNumString);

        }

        JOptionPane.showMessageDialog(null, "End of the program");

    }
}
