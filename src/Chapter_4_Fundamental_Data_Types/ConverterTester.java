package Chapter_4_Fundamental_Data_Types;

import java.util.Scanner;

/**
 * Solution to exercise P4.7
 *
 * @author ChrisBerryman
 */
public class ConverterTester {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Converter converter = new Converter();
        Scanner in  = new Scanner(System.in);        
        System.out.println("Enter meters:");
        
        double meters = in.nextDouble();        
        double miles = converter.getMiles(meters);
        double feet = converter.getFeet(meters);
        double inches = converter.getInches(meters);       
        System.out.println("Miles:" + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

}
