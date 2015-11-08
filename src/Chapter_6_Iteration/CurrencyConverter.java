package Chapter_6_Iteration;

import java.util.Scanner;
/**
 * Solution to exercise P6.3
 
 * @author ChrisBerryman
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter today's price of one dollar in Euro: ");
        double euroPrice = in.nextDouble();
        boolean done = false;
        while(!done)
        {
            System.out.println("Enter dollar value or Q to quit: ");
            String input = in.next();
            if(input.equalsIgnoreCase("Q")){
                done = true;
            } else {
              int dollar = Integer.parseInt(input);
              double euro = dollar * euroPrice;
              System.out.println("Euro price for " + input + " Euro(s) is " + euro + "\n");
            }
        }
    }

}
