package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise 5.3
 * 
 * @author ChrisBerryman
 */
public class SortedTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter three numbers:");
        double first = in.nextDouble();
        double second = in.nextDouble();
        double third = in.nextDouble();

        Sorted s = new Sorted(first, second, third);
        
        System.out.println(s.sort());
        
    }

}
