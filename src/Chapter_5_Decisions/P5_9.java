package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.9
 * 
 * @author ChrisBerryman
 */
public class P5_9 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Please enter your birthday (month and day):");
        Scanner in = new Scanner(System.in);
        String birthday = in.nextLine(); 
        int month = Integer.parseInt(birthday.substring(0,1));
        int day = Integer.parseInt(birthday.substring(1,4));
        
        switch (month) {
            case 1: 
                //if day 
                break;
        }
        
    }
    
}
