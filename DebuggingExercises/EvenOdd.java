import javax.swing.*;
public class EvenOdd {
    public static void main(String args[]){
        String userNumString;
        int userNum;
        userNumString = JOptionPane.showInputDialog(null,
                "Enter a number");
        userNum = Integer.parseInt(userNumString);

        if (userNum % 2 == 0){
            System.out.print("Even number");
        }
        else {
            System.out.print("Odd number");
        }

    }
}
