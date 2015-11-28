package Chapter_6_Iteration;

import java.util.Scanner;

/**
 * Solution to exercise P6.8
 * @author ChrisBerryman
 */
public class FactorPrinter {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to factor: ");
        int numberToFactor = Integer.parseInt(in.next());
        FactorGenerator fp = new FactorGenerator(numberToFactor);
        while(fp.hasMoreFactors()) {
            System.out.println(fp.nextFactor());
        }
    }
    
}
