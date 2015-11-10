package Chapter_5_Decisions;

import java.util.Scanner;


/**
 * Solution to exercise P5.13
 *
 * @author ChrisBerryman
 */
public class MonthTester {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Month month = new Month();
        System.out.println("Enter a month (1-12):");
        int monthNumber = in.nextInt();
        System.out.println(month.getDays(monthNumber) + " days");   
    }
    
}
