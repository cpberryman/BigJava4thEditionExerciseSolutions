package Chapter_5_Decisions;

import java.util.Scanner;
/**
 * 
 * Solution to exercise P5.8
 * 
 * This program calculates a simple tax return.
 * 
 * @author ChrisBerryman
 */
public class TaxCalculator1913 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();        
        TaxReturn1913 aTaxReturn = new TaxReturn1913(income);        
        System.out.println("Tax: "
                + aTaxReturn.getTax());            
    }
    
}
