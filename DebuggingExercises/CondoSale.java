
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jc429278 on 23/08/17.
 */
public class CondoSale {
    public static void main (String arg[]) {
        int userInput;
        HashMap<Integer, String> condo = new HashMap<Integer, String>();
        condo.put(1,"Park view");
        condo.put(2, "Golf course view");
        condo.put(3, "Lake view");

        HashMap<String, String> condoPrice = new HashMap<String,String>();
        condoPrice.put("PARK VIEW", "$150,000");
        condoPrice.put("GOLF COURSE VIEW", "$170,000");
        condoPrice.put("LAKE VIEWS", "$210,000");

        Scanner input = new Scanner(System.in);
        System.out.println("Select a condo:");
        for (int val = 1 ; val == condo.size(); val++ ) {
            System.out.println(String.format("%d: %s ", val, condo.get(val)));
        }
        userInput = input.nextInt();
        condo[userInput];



    }
}
