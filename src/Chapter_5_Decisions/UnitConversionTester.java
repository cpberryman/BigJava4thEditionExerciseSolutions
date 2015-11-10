/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.17
 *
 * @author ChrisBerryman
 */
public class UnitConversionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Convert from:");
        String fromUnit = in.next();
        System.out.println("Convert to:");
        String toUnit = in.next();
        UnitConversion from = new UnitConversion(fromUnit);
        UnitConversion to = new UnitConversion(toUnit);
        System.out.println("Value:");
        double value = in.nextDouble();
        double meters = from.toMeters(value);
        double converted = to.fromMeters(meters);
        System.out.println(value + " " + fromUnit + " = " + converted
                + " " + toUnit);
    }

}
