package Chapter_5_Decisions;

import java.util.Scanner;

/**
 * Solution to exercise P5.14
 *
 * @author ChrisBerryman
 */
public class P5_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two floating point numbers:");
        double firstNumber = Math.round(in.nextDouble() * 100) / 100.0;
        double secondNumber = Math.round(in.nextDouble() * 100) / 100.0;

        if (Double.compare(firstNumber, secondNumber) == 0) {
            System.out.println("They are the same when rounded to two decimal places");
            System.out.println("They differ by less than 0.01.");
        } else if (Double.compare(firstNumber, secondNumber) == 1) {
            System.out.println("They are different when rounded to two decimal places.");
            if (Math.abs(firstNumber - secondNumber) > 0.1
                    || Math.abs(secondNumber - firstNumber) > 0.1) {
                System.out.println("They differ by more than 0.01.");
            } else {
                System.out.println("They differ by less than 0.01.");
            }
        }
    }
}
