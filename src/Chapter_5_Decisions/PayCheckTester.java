package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.16
 *
 * @author ChrisBerryman
 */
public class PayCheckTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hourly wage:");
        double hourlyWage = in.nextDouble();
        System.out.println("Enter hours worked:");
        double hoursWorked = in.nextDouble();
        PayCheck payCheck = new PayCheck();
        System.out.println("Weekly pay: " + payCheck.getWeeklyPay(hourlyWage, hoursWorked));
    }

}
