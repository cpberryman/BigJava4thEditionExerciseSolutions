package Chapter_5_Decisions;

import java.util.Scanner;


/**
 * Solution to exercise P5.10
 * 
 * @author ChrisBerryman
 */
public class P5_10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first point in time: ");
        String firstTime = in.next();
        System.out.println("Enter second point in time: ");
        String secondTime = in.next();
        
        int hour1 = Integer.parseInt(firstTime.substring(0, 2));
        int minute1 = Integer.parseInt(firstTime.substring(2, 4));
        
        int hour2 = Integer.parseInt(secondTime.substring(0, 2));
        int minute2 = Integer.parseInt(secondTime.substring(2, 4));
        
        if(hour1 < hour2) {
            System.out.println(firstTime + " comes first");
        } else if (hour1 == hour2) {
            if (minute1 < minute2) {
               System.out.println(firstTime + " comes first"); 
            } else if (minute1 < minute2) {
               System.out.println(firstTime + " and " + secondTime + " are the same"); 
            } else {
               System.out.println(secondTime + " comes first"); 
            }
        } else {
            System.out.println(secondTime + " comes first"); 
        }        
    }    
}
