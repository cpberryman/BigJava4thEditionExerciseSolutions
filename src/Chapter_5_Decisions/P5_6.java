package Chapter_5_Decisions;

import java.util.Scanner;
/**
 * Solution to exercise P5.6
 * 
 * @author ChrisBerryman
 */
public class P5_6 {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        System.out.println("Please enter three strings:");
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String s3 = in.next();
        System.out.println("The inputs in sorted order are:");
        
        if (s1.compareToIgnoreCase(s2) < 0 && s2.compareToIgnoreCase(s3) < 0) {
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        } else if (s2.compareToIgnoreCase(s1) < 0 && s1.compareToIgnoreCase(s3) < 0) {
            System.out.println(s2);
            System.out.println(s1);
            System.out.println(s3);
        } else if (s3.compareToIgnoreCase(s1) < 0 && s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(s3);
            System.out.println(s1);
            System.out.println(s2);
        } else if (s3.compareToIgnoreCase(s2) < 0 && s2.compareToIgnoreCase(s1) < 0){
            System.out.println(s3);
            System.out.println(s2);
            System.out.println(s1);
        } else if (s2.compareToIgnoreCase(s3) < 0 && s3.compareToIgnoreCase(s1) < 0){
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s1);
        } else {
            System.out.println(s1);
            System.out.println(s3);
            System.out.println(s2);
        }
        
        
                
    }
    
}
