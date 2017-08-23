import java.util.Scanner;

public class CountByAnything {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to start:");
        int userNum = input.nextInt();

        for (int start = userNum; start <= 300 ; start++)
        {
            if (start  % 10 == 0){
                System.out.println(start);
            }
            else {
                System.out.print(start + " ");
            }

        }
    }
}


