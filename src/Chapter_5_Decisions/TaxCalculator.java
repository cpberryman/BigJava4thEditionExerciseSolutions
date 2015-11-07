package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.7
 * 
 * This program calculates a simple tax return.
 */
public class TaxCalculator {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();
        System.out.print("Are you married? (Y/N) ");
        String input = in.next();        
        int status;
        
        if (input.equalsIgnoreCase("Y")) {
            status = TaxReturn.MARRIED;
        } else {
            status = TaxReturn.SINGLE;
        }
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        System.out.println("Tax: "
                + aTaxReturn.getTax());
    }
}
