
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
        String condoName;
        String condoPrice;
        HashMap<Integer, String> condo = new HashMap<Integer, String>();
        condo.put(1,"Park view");
        condo.put(2, "Golf course view");
        condo.put(3, "Lake view");

        HashMap<String, String> condoPrices = new HashMap<String,String>();
        condoPrices.put("Park view", "$150,000");
        condoPrices.put("Golf course view", "$170,000");
        condoPrices.put("Lake view", "$210,000");

        Scanner input = new Scanner(System.in);
        System.out.println("Select a condo:");
        for (int val = 1 ; val == condo.size(); val++ ) {
            System.out.println(String.format("%d: %s ", val, condo.get(val)));
        }
        userInput = input.nextInt();
        condoName = condo.get(userInput);
        condoPrice = condoPrices.get(condoName);
        System.out.println(String.format("You selected %d which is %s and the price is %s", userInput, condoName, condoPrice));



    }
}
