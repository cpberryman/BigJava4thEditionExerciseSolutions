package Chapter_4_Fundamental_Data_Types;

import java.util.Scanner;

/**
 * Solution to exercise P4.4
 *
 * @author ChrisBerryman.
 */
public class PairTester {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Please enter the first value: ");        
        int first = in.nextInt();        
        System.out.println("Please enter the second value: ");
        int second = in.nextInt();
        
        Pair p = new Pair(first, second);        
        System.out.println("Sum: " + p.getSum());        
        System.out.println("Difference: " + p.getDifference());        
        System.out.println("Product: " + p.getProduct());        
        System.out.println("Average: " + p.getAverage());        
        System.out.println("Distance: " + p.getDistance());        
        System.out.println("Maximum: " + p.getMaximum());        
        System.out.println("Minimum: " + p.getMinimum());
        
    }
    
}
